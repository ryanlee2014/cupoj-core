package com.cupacm.oj.manager.schedule.impl;

import com.cupacm.oj.api.bo.SimNode;
import com.cupacm.oj.manager.CheatingMapManager;
import com.cupacm.oj.manager.schedule.CheatingMapSchedule;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

@Component
public class CheatingMapScheduleImpl implements CheatingMapSchedule {

    private List<SimNode> simNodes = Lists.newArrayList();

    @Autowired
    private CheatingMapManager cheatingMapManager;

    @Override
    public void buildDAG() throws InterruptedException, ExecutionException, TimeoutException {
        this.simNodes = cheatingMapManager.buildDAG();
    }

    public List<SimNode> getNodeList() {
        return simNodes;
    }
}
