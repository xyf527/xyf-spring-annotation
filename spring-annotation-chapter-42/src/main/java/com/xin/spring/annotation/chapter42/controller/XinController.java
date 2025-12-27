package com.xin.spring.annotation.chapter42.controller;

import com.xin.spring.annotation.chapter42.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author XYF
 * @date 2025-12-27 14:08
 */

@Controller
public class XinController {

    @Autowired
    private HelloService helloService;

    @ResponseBody
    @RequestMapping
    public String hello() {
        return helloService.hello("Spring6");
    }

}
