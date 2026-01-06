package com.xin.spring.annotation.chapter53.controller;

import com.alibaba.fastjson2.JSONObject;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.beans.PropertyEditorSupport;
import java.util.Date;
import java.util.Locale;

/**
 * @author XYF
 * @date 2026-01-06 14:19
 */

@RestController
public class InitBinderController {

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name) {
        return name;
    }

    @InitBinder(value = "name")
    public void bindData(WebDataBinder binder) {
        binder.registerCustomEditor(String.class, new PropertyEditorSupport(){
            @Override
            public void setAsText(String text) {
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("name", text);
                jsonObject.put("detetime", new DateFormatter("yyyy-MM-dd HH:mm:ss").print(new Date(), Locale.CHINA));
                setValue(jsonObject.toString());
            }
        });

    }

}
