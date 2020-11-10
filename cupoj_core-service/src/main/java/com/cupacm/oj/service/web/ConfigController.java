package com.cupacm.oj.service.web;

import com.cupacm.oj.common.annotation.RequestLogging;
import com.cupacm.oj.dao.Users;
import com.cupacm.oj.manager.UserManager;
import com.cupacm.oj.api.bo.SimNode;
import com.cupacm.oj.manager.schedule.CheatingMapSchedule;
import com.cupacm.oj.service.config.db.DatabaseConfiguration;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

@RestController
@RequestMapping
public class ConfigController {

    @Autowired
    private DatabaseConfiguration databaseConfiguration;

    @Autowired
    private UserManager userManager;

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

    @RequestMapping("/config/{configName}")
    public String getConfig(@PathVariable("configName") String configName) {
        return databaseConfiguration.getConfig(configName);
    }

}
