package com.xin.spring.annotation.chapter12.service;

import com.xin.spring.annotation.chapter12.dao.AutowiredDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author XYF
 * @date 2025-12-04 16:10
 * @description TODO
 */

@Service
public class AutowiredService {

    @Autowired
    private AutowiredDao autowiredDao;

    @Override
    public String toString() {
        return "AutowiredService{" +
                "autowiredDao=" + autowiredDao +
                '}';
    }
}
