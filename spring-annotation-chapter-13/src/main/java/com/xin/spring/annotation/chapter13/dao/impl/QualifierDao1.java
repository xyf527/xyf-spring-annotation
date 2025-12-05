package com.xin.spring.annotation.chapter13.dao.impl;

import com.xin.spring.annotation.chapter13.dao.QualifierDao;
import org.springframework.stereotype.Repository;

/**
 * @author XYF
 * @date 2025-12-05 16:20
 * @description TODO
 */

@Repository(value = "qualifierDao1")
public class QualifierDao1 implements QualifierDao {

    public QualifierDao1() {
        System.out.println("执行了QualifierDao1的构造方法...");
    }

}
