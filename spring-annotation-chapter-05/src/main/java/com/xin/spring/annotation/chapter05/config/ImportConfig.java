package com.xin.spring.annotation.chapter05.config;

import com.xin.spring.annotation.chapter05.bean.User;
import com.xin.spring.annotation.chapter05.registrar.MyImportBeanDefinitionRegistrar;
import com.xin.spring.annotation.chapter05.selector.MyImportSelector;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author XYF
 * @date 2025-11-24 16:11
 * @description TODO
 */

@Import(value = {User.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
@Configuration
public class ImportConfig {



}
