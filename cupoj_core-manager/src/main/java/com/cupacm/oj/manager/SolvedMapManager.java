package com.cupacm.oj.manager;

import com.cupacm.oj.api.bo.solvemap.SolvedEdges;
import com.cupacm.oj.common.annotation.RequestLogging;
import com.cupacm.oj.common.annotation.Timer;
import com.cupacm.oj.common.async.AsyncUtil;
import com.cupacm.oj.common.async.TaskFuture;
import com.cupacm.oj.dao.Users;
import com.cupacm.oj.manager.repo.UserRepoManager;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.*;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.stream.Collectors;

@Component
public class SolvedMapManager {
    @Resource
    private UserRepoManager userRepoManager;

    @Resource(name = "statisticsThreadPool")
    private ThreadPoolExecutor threadPoolExecutor;

    @Resource
    private SolutionManager solutionManager;

    @Timer
    public List<SolvedEdges> getSolvedMapByProblemId (Integer problemId) {
        List<Users> users = userRepoManager.getSolvedUsers();
        List<TaskFuture<List<Integer>>> taskFutureList = users.parallelStream().map(e -> AsyncUtil.submit(threadPoolExecutor, () -> solutionManager.getSolutionACListByUserId(e.getUserId()))).collect(Collectors.toList());
        List<List<Integer>> problemLists = taskFutureList.parallelStream().map(TaskFuture::get).filter(e -> Objects.nonNull(e) && !e.isEmpty()).collect(Collectors.toList());
        List<SolvedEdges> solvedEdgesList = problemLists.parallelStream().map(list -> formatAcceptProblemToEdges(list, problemId)).flatMap(Collection::parallelStream).collect(Collectors.toList());
        return mergeSameEdges(solvedEdgesList);
    }

    @Timer
    List<SolvedEdges> mergeSameEdges(List<SolvedEdges> solvedEdgesList) {
        Map<SolvedEdges, Integer> solvedEdgesIntegerMap = Maps.newHashMap();
        for (SolvedEdges solvedEdges : solvedEdgesList) {
            Integer count = solvedEdgesIntegerMap.getOrDefault(solvedEdges, 0);
            solvedEdgesIntegerMap.put(solvedEdges, count + 1);
        }
        return solvedEdgesIntegerMap.entrySet().stream().map(e -> e.getKey().setValue((long)e.getValue())).collect(Collectors.toList());
    }

    List<SolvedEdges> formatAcceptProblemToEdges(List<Integer> acList, Integer problemId) {
        boolean isSpecificProblem = Objects.nonNull(problemId);
        List<SolvedEdges> result = Lists.newArrayList();
        for(int i = 1, length = acList.size(); i < length; ++i) {
            Integer prevProblemId = acList.get(i - 1), currentProblemId = acList.get(i);
            if (!Objects.equals(prevProblemId, currentProblemId)) {
                if (!isSpecificProblem || Objects.equals(prevProblemId, problemId) || Objects.equals(currentProblemId, problemId)) {
                    result.add(SolvedEdges.builder().from(prevProblemId.longValue()).to(currentProblemId.longValue()).build());
                }
            }
        }
        return result;
    }
}
