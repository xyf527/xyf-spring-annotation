package com.xin.spring.annotation.chapter54.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XYF
 * @date 2026-01-06 16:00
 */

@RestController
public class AdviceController {

    @RequestMapping(value = "/advice")
    public String advice(@RequestParam(value = "name") String name) {
        int i = 1 / 0;
        return name;
    }

}
