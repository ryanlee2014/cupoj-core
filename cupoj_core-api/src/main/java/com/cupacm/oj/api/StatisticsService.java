package com.cupacm.oj.api;

import com.cupacm.oj.api.bo.solvemap.SolvedEdges;
import com.cupacm.oj.api.bo.solvemap.SolvedMapRequest;
import com.cupacm.oj.api.bo.solvemap.SolvedMapResponse;

import java.util.List;

public interface StatisticsService {
    SolvedMapResponse getAllSolvedMap();

    SolvedMapResponse getSolvedMapByProblemId(SolvedMapRequest request);
}
