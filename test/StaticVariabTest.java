package com.example.refactor.test;

public class StaticVariabTest {

    void print(){
        System.out.println(Test.bb);
        Test test =new Test();
        System.out.println(test.bb);
        System.out.println(test.cc);
        System.out.println(Test.aa);
    }

    /**
     * 带注释
     */
    void print2(){

    }


}

class Test{
    public static String aa = "aa",cc = "cc";

    public static int bb = 3;
}
