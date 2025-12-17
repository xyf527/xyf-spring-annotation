package com.xin.spring.annotation.chapter27.service.impl;

import com.xin.spring.annotation.chapter27.bean.DeclareParentsBean;
import com.xin.spring.annotation.chapter27.service.DeclareParentsService;
import org.springframework.stereotype.Service;

/**
 * @author XYF
 * @date 2025-12-17 15:43
 */

@Service
public class DeclareParentsServiceImpl implements DeclareParentsService {
    @Override
    public void saveAndUpdateDeclareParents(DeclareParentsBean declareParentsBean) {
        System.out.println("执行保存或更新操作...");
    }
}
