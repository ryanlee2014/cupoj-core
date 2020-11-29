package com.cupacm.oj.service.impl;

import com.cupacm.oj.api.StatisticsService;
import com.cupacm.oj.api.bo.solvemap.SolvedEdges;
import com.cupacm.oj.api.bo.solvemap.SolvedMapRequest;
import com.cupacm.oj.api.bo.solvemap.SolvedMapResponse;
import com.cupacm.oj.manager.SolvedMapManager;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

@DubboService
public class StatisticsServiceImpl implements StatisticsService {

    @Resource
    private SolvedMapManager solvedMapManager;

    @Override
    public SolvedMapResponse getAllSolvedMap() {
        return SolvedMapResponse.builder().solvedEdgesList(solvedMapManager.getSolvedMapByProblemId(null)).build();
    }

    @Override
    public SolvedMapResponse getSolvedMapByProblemId(SolvedMapRequest request) {
        return SolvedMapResponse.builder().solvedEdgesList(solvedMapManager.getSolvedMapByProblemId(request.getProblemId())).build();
    }
}
