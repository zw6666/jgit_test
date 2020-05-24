package com.example.refactor.test;

import groovy.transform.ASTTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DiamondTest {

    void print(){
        List<String> list = new ArrayList<>();
        HashMap<String,String> map2 = new HashMap<>();
        HashMap<String,String>map = new HashMap<>();
        HashMap<String,AstTest>map1 = new HashMap<>();
        List<String>list1 = new ArrayList<>();
        List list2 = new ArrayList(10);
        HashMap map3 = new HashMap(5);
    }
}

