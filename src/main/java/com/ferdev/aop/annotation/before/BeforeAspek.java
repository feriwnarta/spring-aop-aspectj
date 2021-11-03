package com.ferdev.aop.annotation.before;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class BeforeAspek {

    //                   | harus ada spasi * O
    //                                 .. 2
    // @Pointcut("execution(* Operation.*(..))") // ini semua method dan return value / modifire apapun
    @Pointcut("execution(* Operation.m*(..))")
    public void k(){}; // ini point cut

    @Before("k()")
    public void myAdvice(JoinPoint joinPoint){
        System.out.println("informasi tambahan");
    }



}
