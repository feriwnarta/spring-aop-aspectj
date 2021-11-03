package com.ferdev.aop.annotation.arround;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AroundAspek {

    @Pointcut("execution(* Operation.*(..))")
    public void pointCutOnAround(){};


    // jika menggunakan arround joint point
    @Around("pointCutOnAround()")
    public Object myAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("before advice in arround join point");
        Object result = joinPoint.proceed();
        System.out.println("after advice in arround join point");
        return result;
    }
}
