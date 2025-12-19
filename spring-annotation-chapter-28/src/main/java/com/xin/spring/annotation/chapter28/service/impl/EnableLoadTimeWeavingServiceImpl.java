package com.xin.spring.annotation.chapter28.service.impl;

import com.xin.spring.annotation.chapter28.service.EnableLoadTimeWeavingService;
import org.springframework.stereotype.Service;

/**
 * @author XYF
 * @date 2025-12-17 19:28
 */

@Service
public class EnableLoadTimeWeavingServiceImpl implements EnableLoadTimeWeavingService {
    @Override
    public void printEnableLoadTimeWeaving() {
        System.out.println("执行了打印操作...");
    }
}
