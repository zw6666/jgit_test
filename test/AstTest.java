package com.example.refactor.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AstTest {
    String a = "a", b = "b";
    String c = "c";
    String d = "d";
    Long mylong;
    Long mylong1 = 1000L;
    Long mylong2 = 1000L;
    Long mylong3 = new Long(1000);
    long mylong4 = 1000L;
    long mylong5 = 1000L;
    long mylong6 = 1000L;
    AstTest astTest=new AstTest(),astTest1=new AstTest();
    public static void testStatic(){
        Long myLong1 = 1000L;
        Long myLong2 = 10000L;
        Long myLong = new Long(3000);
        long mylong3 = 1000L;
        long mylong4 = 1000L;
        long mylong5 = 1000L;
        TestPrint.print();
        TestPrint testPrint = new TestPrint("ss"),testPrint1 = new TestPrint("aa");
        String a = "aa", b = "b";
        String c,d;
        AstTest astTest = new AstTest();
        testPrint.print();
        new TestPrint("aa").print();
        int num = 5;
        if(num>4 && num<10 || (num==8|num<9) & "ss".equals(a)|num>1000|true) {
			System.out.println("aa");
		}
    }

    public void main(){
        List<String>list = new ArrayList<>();
        HashMap<String,String>map2 = new HashMap<>();
        HashMap<String,String>map = new HashMap<>();
        HashMap<String,AstTest>map1 = new HashMap<>();
        List<String>list1 = new ArrayList<>();
        TestPrint testPrint = new TestPrint("aa");
        AstTest.testStatic();
        AstTest astTest = new AstTest();
        astTest.testStatic();
        try {
            System.out.println("Hello World!");
        }
        catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
        finally {
            try{
                System.out.println("aaa");
            }
            catch (Exception e){
                throw e;
            }
            System.out.println("finally");
            TestPrint.print();
            return;
        }

    }

}

class TestPrint{
    private String a;
    public static void print(){
        System.out.println("aa");
    }
    public TestPrint(String a){
        this.a = a;
    }
}
