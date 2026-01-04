package com.xin.spring.annotation.chapter50.controller;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XYF
 * @date 2026-01-04 19:40
 */

@RestController
public class CookieValueController {

    @RequestMapping(value = "/cookie")
    public String getCookie(@CookieValue(value = "cookies-name") String name) {
        return "{\"cookie-name\" : \"" + name + "\" }";
    }

}
