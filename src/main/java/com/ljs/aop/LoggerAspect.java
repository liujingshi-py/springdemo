package com.ljs.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author liujs
 * @version 1.0
 * @date 2022/11/15 0015 23:17
 */

@Component
@Aspect
public class LoggerAspect {

    @Before("execution(public int com.ljs.aop.CalImpl.*(..))")
    public void before(JoinPoint joinpoint) {
        String name = joinpoint.getSignature().getName();
        System.out.println(name + " 方法的参数是" + Arrays.toString(joinpoint.getArgs()));
    }

    @AfterReturning(value = "execution(public int com.ljs.aop.CalImpl.*(..))", returning = "result")
    public void after(JoinPoint joinpoint, Object result) {
        String name = joinpoint.getSignature().getName();
        System.out.println(name + " 方法的结果是" + result);
    }
}
