package com.ferdev.aop.xmlbased.afterthrowing;

import org.aspectj.lang.JoinPoint;

public class AfterThrowingAdviceXml {

    public void myAdvice(JoinPoint jp, Throwable throwable){
        System.out.println("method advice dijalankan");
        System.out.println("pesan error dari advice method : " + throwable.getMessage());
        throwable.printStackTrace();
    }
}
