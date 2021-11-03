package com.ferdev.aop.annotation.afterreturning;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AfterReturningAspek {

    @AfterReturning(
        pointcut = "execution(* Operation.*(..))",
            returning = "result"
    )
    public void myAdvice(JoinPoint jp, Object result){
        System.out.println("informasi tambahan dari advice");
        System.out.println("method signature " + jp.getSignature());
        System.out.println("result " + result);
        System.out.println("akhir advice");
    }


}
