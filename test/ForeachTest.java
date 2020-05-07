package com.example.refactor.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForeachTest {
    
    void print(){
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        for(String a :list){
            System.out.println("test");
            list.add("ddd");
            list.remove("ccc");
            list.set(0,"aaa");
        }
    }
}
