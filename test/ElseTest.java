package com.example.refactor.test;

public class ElseTest {

    public void test(){
        int a=1;
        if(a<5){
            String b = "a";
        }
        else {
            System.out.println("a");
        }
        if(a<0){
            System.out.println("a<0");
        } else {
			System.out.println("a>0");
		}

        if(a<0){
            System.out.println("a<0");
        }
        if(a<0){
            System.out.println("a<0");
        }
    }
}
