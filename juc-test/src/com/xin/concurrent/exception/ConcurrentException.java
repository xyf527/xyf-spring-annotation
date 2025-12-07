package com.xin.concurrent.exception;

import java.io.Serial;

/**
 * @author XYF
 * @date 2025-12-07 11:30
 */

public class ConcurrentException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = -1973887926579239003L;

    public ConcurrentException() {
        super();
    }

    public ConcurrentException(String message) {
        super(message);
    }

    public ConcurrentException(Throwable cause) {
        super(cause);
    }

    public ConcurrentException(String message, Throwable cause) {
        super(message, cause);
    }

}
