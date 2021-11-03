package com.ferdev.aop.dtd.beforeadvice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforeAdviceContoh implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("informasi tambahan before method");
        System.out.println(method.getName() + " " + method.getModifiers());
        System.out.println("argument info");
        for(Object arg : args){
            System.out.println(arg);
        }
        System.out.println("target objek : " + target);
        System.out.println("target objek class name " + target.getClass().getName());

    }
}
