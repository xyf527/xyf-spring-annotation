package com.xin.spring.annotation.chapter13.service;

import com.xin.spring.annotation.chapter13.dao.QualifierDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author XYF
 * @date 2025-12-05 16:21
 * @description TODO
 */

@Service
public class QualifierService {

    @Autowired
    @Qualifier("qualifierDao2")
    private QualifierDao qualifierDao;

    @Override
    public String toString() {
        return "QualifierService{" +
                "qualifierDao=" + qualifierDao +
                '}';
    }
}
