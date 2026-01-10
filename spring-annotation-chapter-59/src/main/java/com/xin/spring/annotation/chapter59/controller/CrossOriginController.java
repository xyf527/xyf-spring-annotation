package com.xin.spring.annotation.chapter59.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XYF
 * @date 2026-01-09 17:27
 */

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class CrossOriginController {

    @RequestMapping(value = "/cross")
    public String crossOrigin(@RequestParam(value = "name") String name) {
        return "{\"name\" : \"" + name +"\"}";
    }

}
