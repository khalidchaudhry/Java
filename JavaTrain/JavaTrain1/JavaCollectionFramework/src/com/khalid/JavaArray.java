package com.khalid;

public class JavaArray {
    public static void main(String[] args) {

        //int type array
        int[] intArray=new int[10];

        // Object type array
        Object[] objArray=new Object[10];
        objArray[0]=10;
        objArray[1]="Hello";
        objArray[2]=56.59;
        objArray[3]=intArray;

        for(int i=0;i<objArray.length;++i) {
            System.out.println(objArray[i]);
        }

    }



}
