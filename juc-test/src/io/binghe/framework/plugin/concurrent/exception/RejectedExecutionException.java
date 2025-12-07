
package io.binghe.framework.plugin.concurrent.exception;


import java.io.Serial;

/**
 * @author binghe(微信 : hacker_binghe)
 * @version 1.0.0
 * @description 自定义异常
 * @github https://github.com/binghe001
 * @copyright 公众号: 冰河技术
 */
public class RejectedExecutionException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1541723618448653052L;

    public RejectedExecutionException() { }
    
    public RejectedExecutionException(String message) {
        super(message);
    }
  
    public RejectedExecutionException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public RejectedExecutionException(Throwable cause) {
        super(cause);
    }
}
