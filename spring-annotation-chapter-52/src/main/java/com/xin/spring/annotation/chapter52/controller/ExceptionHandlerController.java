package com.xin.spring.annotation.chapter52.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XYF
 * @date 2026-01-05 16:43
 */

@RestController
public class ExceptionHandlerController {

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam("name")String name) {
        int i = 1 / 0;
        return "hello" + name;
    }

    @ExceptionHandler(value = Exception.class)
    public String handlerException(Exception e) {
        return "exception info is: " + e.getMessage();
    }

}
