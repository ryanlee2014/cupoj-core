package com.cupacm.oj.main.bootstrap;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication(scanBasePackages = {
        "com.cupacm.oj"
})
public class OnlineJudgeBootstrap {
    public static void main(String[] args) {
        ApplicationContext context = new SpringApplicationBuilder(OnlineJudgeBootstrap.class).run(args);
    }
}