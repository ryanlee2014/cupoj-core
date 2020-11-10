package com.cupacm.oj.manager.schedule;

import com.cupacm.oj.api.bo.SimNode;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public interface CheatingMapSchedule {
    void buildDAG() throws InterruptedException, ExecutionException, TimeoutException;

    List<SimNode> getNodeList();
}
