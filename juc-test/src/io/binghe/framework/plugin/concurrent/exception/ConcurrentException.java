package io.binghe.framework.plugin.concurrent.exception;

import java.io.Serial;

/**
 * @author binghe(微信 : hacker_binghe)
 * @version 1.0.0
 * @description 自定义异常
 * @github https://github.com/binghe001
 * @copyright 公众号: 冰河技术
 */
public class ConcurrentException extends RuntimeException{

    @Serial
    private static final long serialVersionUID = -1973887926579239003L;

    public ConcurrentException(){
        super();
    }

    public ConcurrentException(String message){
        super(message);
    }

    public ConcurrentException(Throwable cause){
        super(cause);
    }

    public ConcurrentException(String message, Throwable cause){
        super(message, cause);
    }
}
