package com.zzl;


public class StringToint {
    public Integer changeType(String s){
        try{
            return Integer.valueOf(s);

    } catch (Exception e){
        return null;
    }
    }
    public static void main(String[] args){
        StringToint t= new StringToint();
        System.out.println(t.changeType("a"));
    }
}
