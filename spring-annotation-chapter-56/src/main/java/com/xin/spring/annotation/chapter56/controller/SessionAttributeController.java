package com.xin.spring.annotation.chapter56.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

/**
 * @author XYF
 * @date 2026-01-08 17:40
 */

@RestController
public class SessionAttributeController {

    @RequestMapping(value = "/session/test1")
    public String test1(HttpServletRequest request) {
        request.getSession().setAttribute("name", "xin");
        return "set session attribute success...";
    }

    @RequestMapping(value = "/session/test2")
    public String test2(@SessionAttribute("name") String name) {
        return "hello " + name;
    }

}

