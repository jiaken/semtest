package com.zzl;

/**
 * Created by Administrator on 2016/12/23.
 */
public class TestGenerics {
    public<T> T test(T t){
        if(t instanceof Integer){
            return(T)((Integer)((Integer)t+1));
        } else {
            return(T)((String)t+1);
        }
    }
    public static void main(String[] args){
        TestGenerics t = new TestGenerics();
        Integer r = t.test(3);
        System.out.println(r);
        String s = t.test("3");
        System.out.println(s);
    }
}
