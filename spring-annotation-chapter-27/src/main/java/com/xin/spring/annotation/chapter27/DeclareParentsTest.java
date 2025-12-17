package com.xin.spring.annotation.chapter27;

import com.xin.spring.annotation.chapter27.bean.DeclareParentsBean;
import com.xin.spring.annotation.chapter27.config.DeclareParentsConfig;
import com.xin.spring.annotation.chapter27.service.DeclareParentsService;
import com.xin.spring.annotation.chapter27.service.NewDeclareParentsService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author XYF
 * @date 2025-12-17 15:44
 */

public class DeclareParentsTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DeclareParentsConfig.class);
        DeclareParentsService declareParentsService = context.getBean(DeclareParentsService.class);

        DeclareParentsBean declareParentsBean = new DeclareParentsBean("xin");
        /*NewDeclareParentsService newDeclareParentsService = (NewDeclareParentsService) declareParentsService;
        if (!newDeclareParentsService.validate(declareParentsBean)) {
            throw new IllegalStateException("参数不合法...");
        }*/
        // System.out.println("参数合法 执行保存操作...");
        declareParentsService.saveAndUpdateDeclareParents(declareParentsBean);

        System.out.println("整个过程执行完毕");
        context.close();
    }

}
