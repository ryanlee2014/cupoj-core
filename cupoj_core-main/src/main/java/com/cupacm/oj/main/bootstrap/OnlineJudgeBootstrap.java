package com.cupacm.oj.main.bootstrap;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication(scanBasePackages = {
        "com.cupacm.oj"
}, exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class OnlineJudgeBootstrap {
    public static void main(String[] args) {
        System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism","500");
        ApplicationContext context = new SpringApplicationBuilder(OnlineJudgeBootstrap.class).run(args);
    }
}
