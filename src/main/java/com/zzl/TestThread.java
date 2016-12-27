package com.zzl;


import java.util.concurrent.*;

/**
 * Created by Administrator on 2016/12/23.
 */
public class TestThread<V> implements Callable<V>{
    @Override
    public V call() throws  Exception{
        String name = Thread.currentThread().getName();
        System.out.println(name);
        return (V)(name+"return result");
    }
}
