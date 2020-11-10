package com.cupacm.oj.manager;

import com.cupacm.oj.api.bo.SimNode;
import com.cupacm.oj.dao.Sim;
import com.cupacm.oj.manager.repo.SimRepoManager;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.*;
import java.util.stream.Collectors;

@Component
public class CheatingMapManager {

    @Autowired
    @Qualifier("buildDAG")
    private ThreadPoolExecutor threadPoolExecutor;

    @Autowired
    private SimRepoManager simRepoManager;

    public List<SimNode> buildDAG() throws InterruptedException, ExecutionException, TimeoutException {
        long simCount = simRepoManager.getTotalCountOfSim();
        List<Future<List<Sim>>> simList = Lists.newArrayList();
        List<Sim> sims = Lists.newArrayList();
        for(int i = 0; i < simCount / 10000; ++i) {
            int finalI = i;
            Future<List<Sim>> listFuture = threadPoolExecutor.submit(() -> simRepoManager.getSimRecordByRowBound(finalI * 10000, 10000));
            simList.add(listFuture);
        }
        for (Future<List<Sim>> listFuture : simList) {
            List<Sim> result = listFuture.get(100000, TimeUnit.MILLISECONDS);
            sims.addAll(result);
        }
        Map<String, SimNode> simNodeMap = Maps.newHashMap();
        for (Sim sim : sims) {
            if (Objects.isNull(sim.getsSUserId()) || Objects.isNull(sim.getsUserId())) {
                continue;
            }
            String hash = buildHash(sim.getsSUserId(), sim.getsUserId());
            SimNode node = simNodeMap.get(hash);
            if (Objects.isNull(node)) {
                node = new SimNode(sim.getsUserId(), sim.getsSUserId(), 1);
            }
            else {
                node.setValue(node.getValue() + 1);
            }
            simNodeMap.put(hash, node);
        }
        List<SimNode> resultSim = new ArrayList<>(simNodeMap.values());
        return resultSim.parallelStream().sorted(((a, b) -> {
            Integer aValue = a.getValue();
            Integer bValue = b.getValue();
            return -aValue.compareTo(bValue);
        })).collect(Collectors.toList());
    }

    private String buildHash(String leftString, String rightString) {
        int comp = leftString.compareTo(rightString);
        if (comp > 0) {
            return leftString + "_" + rightString;
        }
        else {
            return rightString + "_" + leftString;
        }
    }
}
