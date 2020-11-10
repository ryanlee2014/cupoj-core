package com.cupacm.oj.common.async;

import com.cupacm.oj.common.async.exception.AsyncExecuteException;
import lombok.*;
import lombok.experimental.Accessors;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TaskFuture<T> {
    private Future<T> future;

    private boolean throwException = true;

    private Exception exception;

    public T get() {
        return innerExecute(() -> future.get());
    }

    public T get(long timeout, TimeUnit timeUnit) {
        return innerExecute(() -> future.get(timeout, timeUnit));
    }

    private T innerExecute(AsyncHandler<T> handler) {
        try {
            return handler.call();
        }
        catch (ExecutionException | InterruptedException | TimeoutException e) {
            if (throwException) {
                throw new AsyncExecuteException();
            }
            else {
                exception = e;
                return null;
            }
        }
    }
}
