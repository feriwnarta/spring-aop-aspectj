package com.ferdev.aop.dtd.aroundadvice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class ArroundAdviceContoh implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("informasi tambahan before method eksekusi");
        Object obj = invocation.proceed();
        System.out.println("informasi tambahan sesudah method dieksekusi ");
        return obj;
    }
}
