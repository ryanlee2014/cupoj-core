package com.cupacm.oj.common.async.exception;

public class AsyncExecuteException extends RuntimeException {
    public AsyncExecuteException() {
        super();
    }

    public AsyncExecuteException(String reason) {
        super(reason);
    }
}
