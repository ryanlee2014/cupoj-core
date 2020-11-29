package com.cupacm.oj.service.config.system;

import com.alibaba.nacos.api.annotation.NacosProperties;
import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import lombok.Getter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

@NacosPropertySource(dataId = SystemConfiguration.DATA_ID, autoRefreshed = true, properties = @NacosProperties(encode = "UTF-8"))
@Configuration
@Slf4j
@ToString
@Getter
public class SystemConfiguration {
    public static final String DATA_ID = "system_config";

    public static final String GROUP_ID = "DEFAULT_GROUP";

    @NacosValue(value = "${debug}", autoRefreshed = true)
    private boolean debug;
}
