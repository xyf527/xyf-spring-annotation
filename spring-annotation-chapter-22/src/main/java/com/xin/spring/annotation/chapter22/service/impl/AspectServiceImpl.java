package com.xin.spring.annotation.chapter22.service.impl;

import com.xin.spring.annotation.chapter22.bean.AspectBean;
import com.xin.spring.annotation.chapter22.service.AspectService;
import org.springframework.stereotype.Service;

/**
 * @author XYF
 * @date 2025-12-13 16:47
 */

@Service
public class AspectServiceImpl implements AspectService {

    @Override
    public void saveOrUpdateAspectBean(AspectBean aspectBean) {
//        int i = 1 / 0;
        System.out.println("保存或者更新AspectBean对象...");
    }

}
