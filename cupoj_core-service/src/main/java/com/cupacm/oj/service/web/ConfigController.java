package com.cupacm.oj.service.web;

import com.cupacm.oj.annotation.RequestLogging;
import com.cupacm.oj.dao.Sim;
import com.cupacm.oj.dao.Users;
import com.cupacm.oj.manager.CheatingMapManager;
import com.cupacm.oj.manager.UserManager;
import com.cupacm.oj.manager.model.SimNode;
import com.cupacm.oj.manager.schedule.CheatingMapSchedule;
import com.cupacm.oj.service.config.db.DatabaseConfiguration;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

@RestController("/")
public class ConfigController {

    @Autowired
    private DatabaseConfiguration databaseConfiguration;

    @Autowired
    private UserManager userManager;

    @Autowired
    private CheatingMapSchedule cheatingMapSchedule;

    @RequestMapping("/config")
    @RequestLogging(withResponse = true)
    public String getConfig() {
        return new Gson().toJson(databaseConfiguration.getDriverClassName());
    }

    @RequestLogging(withResponse = true)
    @RequestMapping("/user/{userId}")
    public Users getUser(@PathVariable("userId") String userId) {
        return userManager.getUsersByUserId(userId);
    }

    @RequestLogging
    @RequestMapping("/map")
    public List<SimNode> getSimMap() throws InterruptedException, ExecutionException, TimeoutException {
        return cheatingMapSchedule.getNodeList();
    }
}
