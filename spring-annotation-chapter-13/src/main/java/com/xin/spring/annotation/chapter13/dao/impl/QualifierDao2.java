package com.xin.spring.annotation.chapter13.dao.impl;

import com.xin.spring.annotation.chapter13.dao.QualifierDao;
import org.springframework.stereotype.Repository;

/**
 * @author XYF
 * @date 2025-12-05 16:20
 * @description TODO
 */

@Repository(value = "qualifierDao2")
public class QualifierDao2 implements QualifierDao {

    public QualifierDao2(){
        System.out.println("执行了QualifierDao2的构造方法...");
    }

}
