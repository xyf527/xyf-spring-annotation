package com.xin.spring.annotation.chapter02.componentscan.config;

import com.xin.spring.annotation.chapter02.componentscan.filter.ComponentScanFilter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author XYF
 * @date 2025-11-21 21:59
 * @description 配置
 */

@Configuration
// 指定要扫描的包名 使用只包含的过滤规则 并采用自定义过滤规则
/*
    排除扫描@Controller、@Service和@Repository注解
    @ComponentScan(value = "com.xin.spring.annotation.chapter02", excludeFilters = {
            @Filter(type = FilterType.ANNOTATION, classes = {Controller.class, Service.class, Repository.class})
    })
 */
/*
    只扫描包含@Controller注解的类
    @ComponentScan(value = "com.xin.spring.annotation.chapter02", includeFilters = {
            @Filter(type = FilterType.ANNOTATION, classes = {Controller.class})
    }, useDefaultFilters = false)

*/

/*
     @ComponentScan可重复使用
    @ComponentScan(value = "com.xin.spring.annotation.chapter02", includeFilters = {
            @Filter(type = FilterType.ANNOTATION, classes = {Controller.class})
    }, useDefaultFilters = false)
    @ComponentScan(value = "com.xin.spring.annotation.chapter02", includeFilters = {
            @Filter(type = FilterType.ANNOTATION, classes = {Service.class})
    }, useDefaultFilters = false)
    @ComponentScan(value = "com.xin.spring.annotation.chapter02", includeFilters = {
            @Filter(type = FilterType.ANNOTATION, classes = {Repository.class})
    }, useDefaultFilters = false)
*/
/*
    按照指定类型扫描 如DemoService是一个Java类 它和所有子类都会被加载到Spring容器中
                                    接口类 它和所有实现类都会加载到Spring容器中
    @ComponentScan(value = "com.xin.spring.annotation.chapter02", includeFilters = {
            @Filter(type = FilterType.ANNOTATION, classes = {DemoService.class})
    }, useDefaultFilters = false)
*/
@ComponentScan(value = "com.xin.spring.annotation.chapter02", includeFilters = {
        @Filter(type = FilterType.CUSTOM, classes = {ComponentScanFilter.class})
}, useDefaultFilters = false)
public class ComponentScanConfig {
}
