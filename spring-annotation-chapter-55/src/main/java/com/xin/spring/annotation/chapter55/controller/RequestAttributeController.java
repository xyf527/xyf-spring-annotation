package com.xin.spring.annotation.chapter55.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author XYF
 * @date 2026-01-08 16:04
 */

@Controller
public class RequestAttributeController {

    @RequestMapping(value = "/request/test1")
    public String test1(HttpServletRequest request) {
        request.setAttribute("name", "xin");
        return "forward:/request/test2";
    }

    @ResponseBody
    @RequestMapping(value = "/request/test2")
    public String test2(@RequestAttribute("name") String name) {
        return "hello " + name;
    }

}
