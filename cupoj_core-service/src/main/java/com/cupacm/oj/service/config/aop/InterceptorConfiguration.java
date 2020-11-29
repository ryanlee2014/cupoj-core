package com.cupacm.oj.service.config.aop;

import com.cupacm.oj.common.annotation.RequestLogging;
import com.cupacm.oj.common.annotation.Timer;
import com.cupacm.oj.common.interceptor.TimerInterceptor;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.annotation.Order;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
@Aspect
@Order(1)
public class InterceptorConfiguration {

    private static final com.cupacm.oj.common.interceptor.LoggingInterceptor loggingInterceptor = new com.cupacm.oj.common.interceptor.LoggingInterceptor();

    private static final TimerInterceptor timerInterceptor = new TimerInterceptor();

    @Around("@annotation(logging)")
    public Object invoke(ProceedingJoinPoint proceedingJoinPoint, RequestLogging logging) throws Throwable {
        return loggingInterceptor.invoke(proceedingJoinPoint, logging);
    }

    @Around("@annotation(timer)")
    public Object invoke(ProceedingJoinPoint proceedingJoinPoint, Timer timer) throws Throwable {
        return timerInterceptor.invoke(proceedingJoinPoint, timer);
    }
}
