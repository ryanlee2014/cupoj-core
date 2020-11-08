package com.cupacm.oj.service.config.db;

import com.alibaba.nacos.api.config.annotation.NacosConfigListener;
import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@NacosPropertySource(dataId = "database", groupId = "DEFAULT_GROUP", autoRefreshed = true)
@Configuration
@Getter
@Slf4j
public class DatabaseConfiguration {
    @NacosValue(value = "${url}", autoRefreshed = true)
    private String url;

    @NacosValue(value = "${user}", autoRefreshed = true)
    private String username;

    @NacosValue(value = "${password}", autoRefreshed = true)
    private String password;

    @NacosValue(value = "${driver_class_name}", autoRefreshed = true)
    private String driverClassName;

    @NacosConfigListener(dataId = "database", timeout = 50)
    public void onMessage(String config) {
        log.info("config: {}", config);
    }
}
