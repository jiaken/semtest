package com.zzl;

/**
 * Created by Administrator on 2016/12/26.
 */
public class TestObjectOne extends TestObject{
    public void test(){
        int b = a+this.testObj();
        System.out.println("this is test object one!"+b);
    }
    public void testOne(){
        System.out.println("this is test one!");
    }
}
