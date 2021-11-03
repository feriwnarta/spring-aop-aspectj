package com.ferdev.aop.xmlbased.afterreturning;

import org.aspectj.lang.JoinPoint;


public class AfterReturningXml {

    public void myAdvice(JoinPoint jp, Object result){
        System.out.println("informasi tambahan dari advice");
        System.out.println(jp.getSignature());
        System.out.println("result dari advie : " + result);
    }
}
