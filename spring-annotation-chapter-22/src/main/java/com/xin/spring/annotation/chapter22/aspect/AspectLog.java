package com.xin.spring.annotation.chapter22.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author XYF
 * @date 2025-12-13 16:48
 */

@Component
@Aspect
public class AspectLog {

    @Pointcut("execution(* com.xin.spring.annotation.chapter22.service.impl.*.*(..))")
    private void pointCut(){

    }

    @Before("pointCut()")
    public void beforeLog() {
        System.out.println("@Before注解在执行切入点方法之前记录日志...");
    }

    @After("pointCut()")
    public void afterLog() {
        System.out.println("@After注解在执行切入点方法之后记录日志...");
    }

    @AfterReturning("pointCut()")
    public void afterReturningLog() {
        System.out.println("@AfterReturning注解在切入点方法正常执行后记录日志...");
    }

    @AfterThrowing("pointCut()")
    public void afterThrowingLog() {
        System.out.println("@AfterThrowing注解在切入点方法抛出异常后记录日志...");
    }

    @Around("pointCut()")
    public Object aroundLog(ProceedingJoinPoint pjp) {
        // 返回的结果数据
        Object resultValue = null;
        try {
            System.out.println("在执行切入点方法之前记录日志...");
            // 获取执行方法的参数
            Object[] args = pjp.getArgs();
            // 指定切入点的方法
            resultValue = pjp.proceed(args);
            System.out.println("在切入点方法正常执行后记录日志...");
        } catch (Throwable t) {
            System.out.println("在切入点方法抛出异常后记录日志...");
        } finally {
            System.out.println("无论切入点方法是否抛出异常都会记录日志...");
        }
        return resultValue;
    }

}
