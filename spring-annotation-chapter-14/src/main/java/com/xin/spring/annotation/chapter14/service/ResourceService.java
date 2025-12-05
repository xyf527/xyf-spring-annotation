package com.xin.spring.annotation.chapter14.service;

import com.xin.spring.annotation.chapter14.dao.ResourceDao;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @author XYF
 * @date 2025-12-05 16:48
 * @description TODO
 */

@Service
public class ResourceService {

    @Resource(name = "resourceDao1")
    private ResourceDao resourceDao;

    @Override
    public String toString() {
        return "ResourceService{" +
                "resourceDao=" + resourceDao +
                '}';
    }
}
