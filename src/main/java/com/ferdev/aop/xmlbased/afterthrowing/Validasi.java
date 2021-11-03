package com.ferdev.aop.xmlbased.afterthrowing;

public class Validasi {
    public void cekUmur(int umur) throws Exception{
        if(umur < 17){
            throw new ArithmeticException("umur tidak cukup");
        } else {
            System.out.println("anda boleh masuk");
        }
    }
}
