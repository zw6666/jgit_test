package com.example.refactor.test;

import com.sun.java.util.jar.pack.DriverResource;

public class EqualsTest {

    void print(String a){
        String c = "aaa";
        if("ccc".equals(a)){
            System.out.println("ccc");
        }
        if("ddd".equals(a)){
            System.out.println("aaa");
        }
        if("ccc".equals(c)){
            System.out.println("sss");
        }
        "aaaa".equals(a);
        "aaaa".equals(a);
    }
}
