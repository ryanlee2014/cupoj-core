package com.cupacm.oj.manager.repo;

import com.cupacm.oj.dao.Solution;
import com.cupacm.oj.dao.SolutionExample;
import com.cupacm.oj.dao.SolutionMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class SolutionRepoManager {
    @Resource
    private SolutionMapper solutionMapper;

    public List<Solution> getAcceptSubmissionByUserId(String userId) {
        SolutionExample solutionExample = new SolutionExample();
        solutionExample.createCriteria()
                .andUserIdEqualTo(userId)
                .andResultEqualTo((short)4);
        solutionExample.setOrderByClause("`in_date` asc");
        return solutionMapper.selectByExample(solutionExample);
    }
}
