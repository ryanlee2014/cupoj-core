package com.cupacm.oj.common.async;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

@FunctionalInterface
public interface AsyncHandler<T> {
    T call() throws ExecutionException, InterruptedException, TimeoutException;
}
