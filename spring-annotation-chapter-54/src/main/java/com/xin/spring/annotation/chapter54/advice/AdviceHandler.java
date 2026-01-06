package com.xin.spring.annotation.chapter54.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author XYF
 * @date 2026-01-06 16:02
 */

@ControllerAdvice
public class AdviceHandler {

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public String handlerException(Exception e){
        return "exception info is: " + e.getMessage();
    }

}
