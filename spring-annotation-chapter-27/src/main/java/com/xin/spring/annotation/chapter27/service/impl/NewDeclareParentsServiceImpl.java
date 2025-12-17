package com.xin.spring.annotation.chapter27.service.impl;

import com.xin.spring.annotation.chapter27.bean.DeclareParentsBean;
import com.xin.spring.annotation.chapter27.service.NewDeclareParentsService;

/**
 * @author XYF
 * @date 2025-12-17 15:48
 */

public class NewDeclareParentsServiceImpl implements NewDeclareParentsService {
    @Override
    public boolean validate(DeclareParentsBean declareParentsBean) {
        return DeclareParentsBean.NAME.equals(declareParentsBean.getName());
    }
}
