package com.ferdev.aop.xmlbased.before;

import org.aspectj.lang.JoinPoint;

public class BeforeAspekXml {

    public void myAdvice(JoinPoint joinPoint){
        System.out.println("informasi tambahan dari advice");
    }
}
