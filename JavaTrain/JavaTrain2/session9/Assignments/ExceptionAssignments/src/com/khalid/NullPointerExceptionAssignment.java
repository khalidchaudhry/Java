package com.khalid;

public class NullPointerExceptionAssignment {
    public static void main(String[] args) {
        String str=null;
        try {
            str.length();
        }catch (NullPointerException e){
            System.out.println("String is null");
            System.out.println(e);
        }
        System.out.println("After the catch");
    }
}
