package com.ferdev.aop.dtd.beforeadvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TstApp {
    public static void main(String[] args) {
        // bikin bean objek
        // bikin advice bean
        // hubungkan / weaving dengan proxy objek class="org.springframework.aop.framework.proxyFactoryBean"
        // tentukan target objek, yaitu bean objek class kita
        // interceptor names diisi oleh list
        // dengan value advice bean yang akan kita terapkan ke objek bean

        ApplicationContext context
                = new ClassPathXmlApplicationContext("beforeAdviceDtd.xml");

        Objek result = context.getBean("proxy", Objek.class);
        result.message();




    }
}
