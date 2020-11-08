package com.cupacm.oj.service.config.aop;

import com.cupacm.oj.annotation.RequestLogging;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.annotation.Order;

@Configuration
@EnableAspectJAutoProxy
@Aspect
@Order(1)
public class LoggingInterceptor {
    @Around("@annotation(logging)")
    public Object invoke(ProceedingJoinPoint proceedingJoinPoint, RequestLogging logging) throws Throwable {
        return new com.cupacm.oj.interceptor.LoggingInterceptor().invoke(proceedingJoinPoint, logging);
    }
}
