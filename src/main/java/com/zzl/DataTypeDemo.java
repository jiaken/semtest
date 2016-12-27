package com.zzl;

/**
 * Created by Administrator on 2016/12/19.
 */
public class DataTypeDemo {
    public Byte b=10;
    public void test(Byte b){
        b=19;
    }
    public static void main(String[] args){
        DataTypeDemo d = new DataTypeDemo();
        d.test(d.b);
        System.out.println(d.b);
    }
}
