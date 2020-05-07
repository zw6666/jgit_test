package com.example.refactor.test;

public class SwitchTest {

    public String test(String content){
        switch (content){
            case "aaa":
                System.out.println("aaa");
                break;
            case "bbb":
                System.out.println("bbb");
                return "bbb";
            case "ccc":
                System.out.println("ccc");
                System.out.println("ccc");
                System.out.println("ccc");
                System.out.println("ccc");
                System.out.println("ccc");
                System.out.println("ccc");
                return "ccc";
            case "ddd":
                System.out.println("ddd");
            default:
                break;

        }
        return "out switch";
    }
}
