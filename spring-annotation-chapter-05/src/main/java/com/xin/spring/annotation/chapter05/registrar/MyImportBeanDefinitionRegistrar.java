package com.xin.spring.annotation.chapter05.registrar;

import com.xin.spring.annotation.chapter05.bean.ImportBeanDefinitionRegistrarBean;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author XYF
 * @date 2025-11-24 16:35
 * @description TODO
 */

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        String beanName = ImportBeanDefinitionRegistrarBean.class.getName();
        BeanDefinition beanDefinition = new RootBeanDefinition(ImportBeanDefinitionRegistrarBean.class);
        registry.registerBeanDefinition(beanName, beanDefinition);
    }

}
