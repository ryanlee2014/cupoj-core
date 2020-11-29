package com.cupacm.oj.common.interceptor;

import com.cupacm.oj.common.annotation.Timer;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TimerInterceptor {
    private static final Logger logger = LoggerFactory.getLogger(LoggingInterceptor.class);

    @Around("@annotation(timer)")
    public Object invoke(ProceedingJoinPoint proceedingJoinPoint, Timer timer) throws Throwable {
        long startTime = System.currentTimeMillis();
        String clazzName = proceedingJoinPoint.getTarget().getClass().getSimpleName();
        String methodName = proceedingJoinPoint.getSignature().getName();
        Object response = proceedingJoinPoint.proceed();
        long endTime = System.currentTimeMillis();
        long costTime = endTime - startTime;
        logger.info("[{}:{}] response time {}ms", clazzName, methodName, costTime);
        return response;
    }
}
