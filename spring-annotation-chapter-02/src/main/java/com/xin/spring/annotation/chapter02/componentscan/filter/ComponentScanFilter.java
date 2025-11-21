package com.xin.spring.annotation.chapter02.componentscan.filter;

import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @author XYF
 * @date 2025-11-21 21:52
 * @description 自定义过滤规则
 */

public class ComponentScanFilter implements TypeFilter {

    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        // 获取当前正在扫描的类的信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        // 获取当前正在扫描的类名
        String className = classMetadata.getClassName();
        return className.contains("componentScanConfig");
    }

}
