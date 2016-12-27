package com.zzl.test;

import com.zzl.Controller;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2016/12/27.
 */
public class TestDemo {
    @Test
    public void testDemo(){
        Controller controller = new Controller();
        
        System.out.println("this is test method!");
    }


}
