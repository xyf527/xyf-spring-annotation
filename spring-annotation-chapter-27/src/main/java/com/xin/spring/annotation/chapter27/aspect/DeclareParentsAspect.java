package com.xin.spring.annotation.chapter27.aspect;

import com.xin.spring.annotation.chapter27.bean.DeclareParentsBean;
import com.xin.spring.annotation.chapter27.service.NewDeclareParentsService;
import com.xin.spring.annotation.chapter27.service.impl.NewDeclareParentsServiceImpl;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author XYF
 * @date 2025-12-17 15:50
 */

@Aspect
@Component
public class DeclareParentsAspect {

    @DeclareParents(value = "com.xin.spring.annotation.chapter27.service.DeclareParentsService+", defaultImpl = NewDeclareParentsServiceImpl.class)
    private NewDeclareParentsService newDeclareParentsService;

    @Pointcut("execution(* com.xin.spring.annotation.chapter27.service.impl.*.*(..))")
    private void pointCut(){}


    @Before(value = "pointCut() && args(declareParentsBean) && this(newDeclareParentsService)")
    public void validate(DeclareParentsBean declareParentsBean, NewDeclareParentsService newDeclareParentsService){
        if (!newDeclareParentsService.validate(declareParentsBean)){
            throw new IllegalStateException("参数不合法...");
        }
        System.out.println("参数合法，执行保存操作...");
    }
}
