package com.khalid.InSessionPractice;

public class Main {
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer("Welcome");
        StringBuffer str2=str;
        str=str.append(" to Java");
        if(str2==str){
            System.out.println("Object reference are same");
        }else{
            System.out.println("Object reference are not same");
        }
        if(str.equals(str2)){
            System.out.println("Contents are equal");
        }else {
            System.out.println("Contents are not equal");
        }



    }
}