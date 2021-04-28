package com.mars.sigh.dev.login.controller;

import org.thymeleaf.util.StringUtils;

public class test {
    public static void main(String[] args) {
        boolean flag = StringUtils.isEmpty("");
        byte[] ar = {'a','b'};
        int bb=0;
        if(ar==null){
            System.out.println("等于null");
        }else{
            ss(ar, 100);
        }


    }

    public static byte[] ss(byte[] aa, int bb) {
        if (aa.length < bb) {
            System.out.println("等于bb");
            return aa;
        }else{
            return null;
        }

    }

}
