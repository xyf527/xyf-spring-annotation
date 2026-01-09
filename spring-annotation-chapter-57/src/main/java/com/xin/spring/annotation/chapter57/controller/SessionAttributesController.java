package com.xin.spring.annotation.chapter57.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * @author XYF
 * @date 2026-01-08 17:51
 */

@Controller
@SessionAttributes(value = {"name"})
public class SessionAttributesController {

    @RequestMapping(value = "/sessions/test1")
    public String test1(Model model) {
        model.addAttribute("name", "xin");
        return "redirect:/sessions/test2";
    }

    @ResponseBody
    @RequestMapping(value = "/sessions/test2")
    public String test2(@SessionAttribute("name") String name) {
        return "hello " + name;
    }

}
