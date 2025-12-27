package com.xin.spring.annotation.chapter42.service.impl;

import com.xin.spring.annotation.chapter42.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author XYF
 * @date 2025-12-27 14:08
 */

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String name) {
        return "Hello" + name;
    }

}
