package com.cupacm.oj.service.config.db;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.annotation.NacosProperties;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.config.annotation.NacosConfigListener;
import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import com.cupacm.oj.common.annotation.RequestLogging;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@NacosPropertySource(dataId = DatabaseConfiguration.DATA_ID, groupId = DatabaseConfiguration.GROUP_ID, autoRefreshed = true)
@Configuration
@Getter
@Slf4j
public class DatabaseConfiguration {

    public static final String DATA_ID = "database";

    public static final String GROUP_ID = "DEFAULT_GROUP";

    @NacosInjected(properties = @NacosProperties(encode = "UTF-8"))
    private ConfigService configService;

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

    @RequestLogging(withResponse = true)
    public String getConfig(String configName) {
        try {
            return configService.getConfig(configName, GROUP_ID, 5000);
        }
        catch (Exception e) {
            return null;
        }
    }
}
