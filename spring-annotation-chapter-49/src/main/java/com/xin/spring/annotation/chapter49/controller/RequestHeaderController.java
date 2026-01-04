package com.xin.spring.annotation.chapter49.controller;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XYF
 * @date 2026-01-04 16:19
 */

@RestController
public class RequestHeaderController {

    @RequestMapping(value = "/header")
    public String getHeader(@RequestHeader(value = "header-name") String name) {
        return "{\"header-name\" : \"" + name + "\" }";
    }

}
