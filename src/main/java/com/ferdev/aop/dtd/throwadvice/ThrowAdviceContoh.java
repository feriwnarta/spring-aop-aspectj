package com.ferdev.aop.dtd.throwadvice;

import org.springframework.aop.ThrowsAdvice;

public class ThrowAdviceContoh implements ThrowsAdvice {

    // nama method harus sama
    public void afterThrowing(Exception ex){
        System.out.println("additional concern if exception occurs");
        System.out.println("error handling dari after throwing advice");
        ex.printStackTrace();
    }

}
