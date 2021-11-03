package com.ferdev.aop.annotation.afterthrowing;

public class Operation {

    public void validate(int umur) throws Exception{
        if(umur < 17){
            throw new ArithmeticException("dibawah umur"); // -> runtime exception
        } else {
            System.out.println("anda boleh masuk");
        }
    }
}
