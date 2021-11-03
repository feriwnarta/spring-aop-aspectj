package com.ferdev.aop.annotation.after;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AfterAspek {

    //                   | harus ada spasi * O
    //                                 .. 2
    // @Pointcut("execution(* Operation.*(..))") // ini semua method dan return value / modifire apapun
    @Pointcut("execution(* Operation.*(..))")
    public void k(){}; // ini point cut

    @After("k()")
    public void myAdvice(JoinPoint joinPoint){
        System.out.println("informasi tambahan dari advice");
    }



}
