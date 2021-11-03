package com.ferdev.aop.dtd.afterreturning;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterAdviceContoh implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("informasi tambahan");
        System.out.println("after advice");
        System.out.println(returnValue);
        System.out.println(target.getClass().getName() + "." + method.getName());
    }
}
