package com.cupacm.oj.common.async;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class AsyncUtil {
    public static <T> TaskFuture<T> submit(ThreadPoolExecutor executor, Callable<T> task) {
        Future<T> future = executor.submit(task);
        return new TaskFuture<T>().setFuture(future);
    }

}
