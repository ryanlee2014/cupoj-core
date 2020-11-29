package com.cupacm.oj.common.interceptor;

import com.cupacm.oj.common.annotation.RequestLogging;
import com.cupacm.oj.common.util.SpringContextUtil;
import com.google.common.collect.Lists;
import com.google.gson.Gson;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Optional;

public class LoggingInterceptor {
    private static final Logger logger = LoggerFactory.getLogger(LoggingInterceptor.class);

    private static final Gson gson = new Gson();

    private Object instance;

    private Method debugMethod;

    private boolean isDebugMode() {
        try {
            instance = Optional.ofNullable(instance).orElse(SpringContextUtil.context().getBean("systemConfiguration"));
            debugMethod = Optional.ofNullable(debugMethod).orElse(instance.getClass().getMethod("isDebug"));
            debugMethod.setAccessible(true);
            return (boolean)debugMethod.invoke(instance);
        }
        catch (Exception e) {
            return false;
        }
    }

    @Around("@annotation(logging)")
    public Object invoke(ProceedingJoinPoint proceedingJoinPoint, RequestLogging logging) throws Throwable {
        long startTime = System.currentTimeMillis();
        boolean isDebugMode = isDebugMode();
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
        if (isDebugMode || logging.withResponse()) {
            logger.info("[{}:{}]({}) return: {} response time {}ms", clazzName, methodName, gson.toJson(methodParameterValues), gson.toJson(response), costTime);
        }
        else {
            logger.info("[{}:{}]({}) response time {}ms", clazzName, methodName, gson.toJson(methodParameterValues), costTime);
        }
        return response;
    }
}
