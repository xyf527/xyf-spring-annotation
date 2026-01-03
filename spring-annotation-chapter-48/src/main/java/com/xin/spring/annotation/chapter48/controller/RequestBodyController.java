package com.xin.spring.annotation.chapter48.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XYF
 * @date 2026-01-03 16:37
 */

@RestController
public class RequestBodyController {

    @RequestMapping(value = "/request")
    public String getUser(@RequestBody String params) {
        return params;
    }

}
