package com.ferdev.aop.xmlbased.afterreturning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TstApp {
    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("afterReturningAspekXml.xml");

        Operation op = context.getBean("targetObjek", Operation.class);
        op.msg();
        op.m();
        op.k();
    }
}
