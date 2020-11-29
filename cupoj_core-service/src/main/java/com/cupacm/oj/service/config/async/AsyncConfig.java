package com.cupacm.oj.service.config.async;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Configuration
public class AsyncConfig {
    @Bean("buildDAG")
    public ThreadPoolExecutor asyncExecutor() {
        return new ThreadPoolExecutor(150, 500, 1000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>(500));
    }

    @Bean("statisticsThreadPool")
    public ThreadPoolExecutor statisticsExecutor() {
        return new ThreadPoolExecutor(150, 500, 1000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>(10000), new ThreadPoolExecutor.AbortPolicy());
    }
}
