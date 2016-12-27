package com.zzl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

/**
 * Created by Administrator on 2016/12/22.
 */
public class TestList {
    public void listAction(){
        List<String> list = new ArrayList<String>();
        list.add("a");
        int len = list.size();
        System.out.println(len);
        String s = list.get(0);
        System.out.println(s);
        list.set(0,"b");
        System.out.println(list);
        boolean c = list.contains("b");
        System.out.println(c);
        List<String> l1 = new ArrayList<String>();
        l1.add("c");
        list.addAll(l1);
        System.out.println(list);
        list.retainAll(l1);
        System.out.println(list);
        list.add("d");
        list.add("e");
        List<String> d = list.subList(0,3);
        System.out.println(d);
    }
    public void loopList(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(1);
        list.add(2);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        for(Integer i:list){
            System.out.print(i);
        }
    }
    public void mapAction(){
        Map<String,String> map = new HashMap<String, String>();
        map.put("a","this is a");
        map.put("b","this is zzl");
        int len = map.size();
        System.out.println(len);
        String a = map.get("a");
        System.out.println(a);
        System.out.println(map.get("c"));
        map.put("a","this is a second a");
        System.out.println(map.get("a"));
        boolean c = map.containsKey("a");
        System.out.println(c);
        boolean v = map.containsValue("this is a second a");
        System.out.println(v);
    }
    public void file() throws IOException {
        File file = new File("/home/test");

            FileInputStream fis = new FileInputStream(file);
            System.out.println("a");

            System.out.println("b");

        System.out.println("c");
    }
    public void runtime(){
        int a  = 10;
        if(a>1){
            throw new RuntimeException();
        }
        System.out.println("a");
    }

    public static void main (String[] args){
        TestList ll = new TestList();
        ll.runtime();
    }
}
