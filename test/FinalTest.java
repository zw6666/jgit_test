package com.example.refactor.test;

public final  class FinalTest {

    public void print(){
        System.out.println("aaa");
    }

    public void print1(){
        System.out.println("bbb");
    }
}

class Test1{
    final void print(){
        System.out.println("ccc");
    }
}
