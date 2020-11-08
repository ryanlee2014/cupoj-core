package com.cupacm.oj.interceptor;

import com.cupacm.oj.annotation.RequestLogging;
import com.google.common.collect.Lists;
import com.google.gson.Gson;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class LoggingInterceptor {
    private static final Logger logger = LoggerFactory.getLogger(LoggingInterceptor.class);

    private static final Gson gson = new Gson();

    @Around("@annotation(logging)")
    public Object invoke(ProceedingJoinPoint proceedingJoinPoint, RequestLogging logging) throws Throwable {
        long startTime = System.currentTimeMillis();

        String clazzName = proceedingJoinPoint.getTarget().getClass().getSimpleName();
        String methodName = proceedingJoinPoint.getSignature().getName();

        List<Object> methodParameterValues = Lists.newArrayList(proceedingJoinPoint.getArgs());

        Object response;

        try {
            response = proceedingJoinPoint.proceed();
        }
        catch (Throwable throwable) {
            logger.warn("[{}:{}]({}) throws exception", clazzName, methodName, methodParameterValues, throwable);
            throw throwable;
        }

        long endTime = System.currentTimeMillis();
        long costTime = endTime - startTime;
        if (logging.withResponse()) {
            logger.info("[{}:{}]({}) return: {} response time {}ms", clazzName, methodName, gson.toJson(methodParameterValues), gson.toJson(response), costTime);
        }
        else {
            logger.info("[{}:{}]({}) response time {}ms", clazzName, methodName, gson.toJson(methodParameterValues), costTime);
        }
        return response;
    }
}
