package com.cupacm.oj.manager.schedule.job;

import com.cupacm.oj.common.annotation.RequestLogging;
import com.cupacm.oj.manager.schedule.CheatingMapSchedule;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ScheduleJob {
    @Autowired
    private CheatingMapSchedule cheatingMapSchedule;

    @Scheduled(fixedDelay = 60 * 1000 * 5)
    @RequestLogging
    public void updateCheatingMap() {
        log.info("Execute scheduler job");
        try {
            cheatingMapSchedule.buildDAG();
        }
        catch (Exception e) {
            log.warn("exception caused by scheduler job: ", e);
        }
        log.info("Execute scheduler job finished.");
    }
}
