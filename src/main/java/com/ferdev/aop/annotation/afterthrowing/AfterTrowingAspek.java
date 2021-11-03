package com.ferdev.aop.annotation.afterthrowing;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AfterTrowingAspek {


    @AfterThrowing(
            pointcut = "execution(* Operation.*(..))",
            throwing = "error"
    )
    public void myAdvice(JoinPoint joinPoint, Throwable error){ // reference throwable selalu di pass
        System.out.println("informasi tambahan dari advice");
        System.out.println("method signate : " + joinPoint.getSignature());
        System.out.println("error message : " + error.getMessage());
        error.printStackTrace();
    }
}
