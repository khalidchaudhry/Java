package com.khalid;

 public class StaticDemo {
     public static int var1;
     public StaticDemo() {
         var1=10;
     }
     public static void staticmethod(){
         System.out.println(var1);
     }

     public  void nonstaticmethod(){
         System.out.println(var1);
     }
 }
