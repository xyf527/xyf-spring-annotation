package com.xin.spring.annotation.chapter51.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XYF
 * @date 2026-01-05 15:31
 */

@RestController
public class ModelAttributeController {
    @ModelAttribute(name = "name")
    public String initModel(@RequestParam("name") String name){
        System.out.println("执行了initModel()方法...");
        return name;
    }
    @RequestMapping(value = "/model")
    public String getModelAttribute(@ModelAttribute("name") String name){
        return "{\"name\" : \"" +name + "\"}";
    }
}