package com.ferdev.aop.xmlbased.after;

import org.aspectj.lang.JoinPoint;

public class AfterAspekXml {

    public void myAdvice(JoinPoint jp){
        System.out.println("joint point after");
        System.out.println("informas tambahan dari advice");
    }

}
