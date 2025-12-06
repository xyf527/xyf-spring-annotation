package com.xin.spring.annotation.chapter16.service;

import com.xin.spring.annotation.chapter16.dao.PrimaryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author XYF
 * @date 2025-12-06 22:03
 */

@Service
public class PrimaryService {

    @Autowired
    private PrimaryDao primaryDao;

    @Override
    public String toString() {
        return "PrimaryService{" +
                "primaryDao=" + primaryDao +
                '}';
    }

}
