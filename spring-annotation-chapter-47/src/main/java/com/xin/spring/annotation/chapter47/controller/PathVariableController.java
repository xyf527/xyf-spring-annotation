package com.xin.spring.annotation.chapter47.controller;

import com.xin.spring.annotation.chapter47.bean.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XYF
 * @date 2026-01-03 16:22
 */

@RestController
public class PathVariableController {

    @RequestMapping(value = "/user/{id}/{name}")
    public String getUser(@PathVariable("id") String id, @PathVariable("name") String name) {
        return new User(id, name).toString();
    }

}
