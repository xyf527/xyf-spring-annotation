package com.xin.spring.annotation.chapter46.controller;

import com.xin.spring.annotation.chapter46.bean.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author XYF
 * @date 2026-01-02 16:58
 */

@RestController
public class RequestParamController {

    @RequestMapping(value = "/user")
    public String getUser(@RequestParam(value = "id") String id, @RequestParam(value = "name") String name) {
        return new User(id, name).toString();
    }

    @RequestMapping(value = "/user/map")
    public String getUserByMap(@RequestParam Map<String, String> params) {
        return new User(params.get("id"), params.get("name")).toString();
    }
}
