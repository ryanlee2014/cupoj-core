package com.cupacm.oj.service;

import com.cupacm.oj.api.SimService;
import com.cupacm.oj.api.bo.SimNode;
import com.cupacm.oj.common.annotation.RequestLogging;
import com.cupacm.oj.manager.schedule.CheatingMapSchedule;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@DubboService
public class SimServiceImpl implements SimService {

    @Autowired
    private CheatingMapSchedule cheatingMapSchedule;

    @Override
    public List<SimNode> getCheatingMap() {
        return cheatingMapSchedule.getNodeList();
    }
}
