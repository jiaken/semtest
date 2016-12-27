package com.zzl;

/**
 * Created by Administrator on 2016/12/23.
 */
public class TestReflectObject {
    private int a = 0;
    public int b=1;
    public int sum(int a ,int b){
        return this.a+this.b+a+b;
    }
    private int sum(int a){
        return this.a+this.b+a;
    }
}

