package com.example.refactor.test;

import java.util.Arrays;
import java.util.List;
import java.util.*;
import com.example.refactor.*;
import sun.util.calendar.*;
import com.sun.java.util.jar.pack.DriverResource;

public class StringTest {
    List<String>test = Arrays.asList("aaa","bbb","ccc");
    private void print(){
        String a = "aaa";
        String c = new String("123");
        String b = "bbb";
        System.out.println(new String("ddd"));
        test.set(0,"ccc");
        test.add(a);
        test.remove(b);
        for(int i=0;i<10;i++){
            a=a+"ccc";
            test.add(a);
            test.remove(a);
            System.out.println(test);
        }
    }

//    public static void main(String[]args){
//        StringTest stringTest = new StringTest();
//        stringTest.print();
//    }
}
