package com.zzl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by Administrator on 2016/12/23.
 */
public class ThreadPool {
    private int threadCount = 10;
    private int threadpoolCount = 3;
    public void threadPoolControl(){
        ExecutorService service = Executors.newFixedThreadPool(threadpoolCount);
        List<TestThread<String>> c = new ArrayList<TestThread<String>>();
        for(int i=0;i<threadCount;i++){
            c.add(new TestThread<String>());
        }
        try{
            List<Future<String>> futures = service.invokeAll(c);
            service.shutdown();
            for(Future<String> future:futures){
                System.out.println(future.get());
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        } catch (ExecutionException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        ThreadPool tp = new ThreadPool();
        tp.threadPoolControl();
    }

}

