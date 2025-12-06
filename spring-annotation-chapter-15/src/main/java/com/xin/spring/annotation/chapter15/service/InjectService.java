package com.xin.spring.annotation.chapter15.service;

import com.xin.spring.annotation.chapter15.dao.InjectDao;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * @author XYF
 * @date 2025-12-06 21:53
 */

@Service
public class InjectService {

    @Inject
    private InjectDao injectDao;

    @Override
    public String toString() {
        return "InjectService{" +
                "injectDao=" + injectDao +
                '}';
    }
}
