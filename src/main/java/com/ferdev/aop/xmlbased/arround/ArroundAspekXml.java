package com.ferdev.aop.xmlbased.arround;

import org.aspectj.lang.ProceedingJoinPoint;

public class ArroundAspekXml {

    public Object myAdvice(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("before advice");
        Object result = joinPoint.proceed();
        System.out.println("after advice");
        return result;
    }
}
