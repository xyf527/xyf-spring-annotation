package com.xin.spring.annotation.chapter45.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XYF
 * @date 2025-12-28 15:16
 */

@RestController
public class RequestMappingController {

    @RequestMapping(value = "/hello", method = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.OPTIONS, RequestMethod.DELETE, RequestMethod.PATCH})
    public String hello() {
        return "Hello Spring6";
    }

}
