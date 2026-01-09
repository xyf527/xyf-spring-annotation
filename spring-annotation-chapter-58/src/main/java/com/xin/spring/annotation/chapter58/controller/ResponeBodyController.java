package com.xin.spring.annotation.chapter58.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author XYF
 * @date 2026-01-09 10:29
 */

@Controller
public class ResponeBodyController {

    @ResponseBody
    @RequestMapping(value = "/respone/body")
    public String responseBody(@RequestParam(value = "name") String name) {
        return "hello " + name;
    }

}
