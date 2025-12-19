package com.xin.spring.annotation.chapter28.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

/**
 * @author XYF
 * @date 2025-12-17 19:28
 */

@Aspect
public class EnableLoadTimeWeavingAspect {

    @Pointcut("execution(* com.xin.spring.annotation.chapter28.service.impl.*.*(..))")
    private void pointCut() {}

    @Around("pointCut()")
    public Object aroundHandler(ProceedingJoinPoint pjp) throws Throwable {
//        System.out.println("DEBUG: 进入切面");
        StopWatch sw = new StopWatch(getClass().getSimpleName());
        try {
            sw.start(pjp.getSignature().getName());
            return pjp.proceed();
        } finally {
            sw.stop();
            System.out.println(sw.prettyPrint());
        }
    }

}
