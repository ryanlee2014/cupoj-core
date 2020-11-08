package com.cupacm.oj.manager.repo;

import com.cupacm.oj.dao.Sim;
import com.cupacm.oj.dao.SimExample;
import com.cupacm.oj.dao.SimMapper;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SimRepoManager {
    @Autowired
    private SimMapper simMapper;

    public long getTotalCountOfSim() {
        return simMapper.countByExample(new SimExample());
    }

    public List<Sim> getSimRecordByRowBound(int offset, int limit) {
        SimExample simExample = new SimExample();
        RowBounds rowBounds = new RowBounds(offset, limit);
        return simMapper.selectByExampleWithRowbounds(simExample, rowBounds);
    }
}
