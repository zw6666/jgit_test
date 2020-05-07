package com.example.refactor.test;

public class ThrowableTest {

    void print(){
        try {
            System.out.println("Hello World!");
        }
        catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
        try {
            System.out.println("Hello World!");
        }
        catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
