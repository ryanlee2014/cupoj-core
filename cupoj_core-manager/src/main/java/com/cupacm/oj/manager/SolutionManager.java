package com.cupacm.oj.manager;

import com.cupacm.oj.dao.Solution;
import com.cupacm.oj.manager.repo.SolutionRepoManager;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class SolutionManager {
    @Resource
    private SolutionRepoManager solutionRepoManager;

    List<Integer> getSolutionACListByUserId(String userId) {
        List<Solution> solutionList = solutionRepoManager.getAcceptSubmissionByUserId(userId);
        Set<Integer> problemSet = new HashSet<>();
        solutionList.forEach(e -> problemSet.add(e.getProblemId()));
        return new ArrayList<>(problemSet);
    }
}
