package com.khalid;

public class ArrayIndexOutOfboundAssignment {
    public static void main(String[] args) {
        int[] a=new int[10];
        try {
            a[30]=100;
        }catch (IndexOutOfBoundsException e){
            System.out.println("Array index is out of bound");
            System.out.println(e);
        }

        System.out.println("After catch block");
    }
}
