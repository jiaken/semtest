package com.zzl;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * Created by Administrator on 2016/12/26.
 */
public class TestWeb {
    public void testjsop(){
        try{
            Document doc = Jsoup.connect("http://101.200.201.174:8080/semtest/").get();
            System.out.println(doc);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args ){
        TestWeb testweb = new TestWeb();
        testweb.testjsop();
    }
}
