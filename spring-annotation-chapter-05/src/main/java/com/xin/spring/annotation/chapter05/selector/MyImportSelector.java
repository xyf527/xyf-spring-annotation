package com.xin.spring.annotation.chapter05.selector;

import com.xin.spring.annotation.chapter05.bean.ImportSelectorBean;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author XYF
 * @date 2025-11-24 16:27
 * @description TODO
 */

public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{ImportSelectorBean.class.getName()};
    }
}
