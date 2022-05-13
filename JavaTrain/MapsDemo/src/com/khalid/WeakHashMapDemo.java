package com.khalid;

import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) throws InterruptedException {

        WeakHashMap weakHashMap=new WeakHashMap();
        Temp t=new Temp();
        weakHashMap.put(t,"khalid");
        System.out.println(weakHashMap);
        System.gc();
        Thread.sleep(5000);
        System.out.println(weakHashMap);

    }

    public static class Temp{
        public String toString(){
            return "temp";
        }
        public void finalize(){
            System.out.println("Finialize method called");
        }
    }
}
