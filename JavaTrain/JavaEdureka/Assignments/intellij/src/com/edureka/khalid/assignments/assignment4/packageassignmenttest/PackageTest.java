package com.edureka.khalid.assignments.assignment4.packageassignmenttest;

import com.edureka.khalid.assignments.assignment4.packageassignment.MathUtil;

public class PackageTest {
    public static void main(String[] args) {
        MathUtil util=new MathUtil();
        int num1=100;
        int num2=20;
        System.out.println(num1+"-"+num2+"="+util.subtract(num1,num2));
        System.out.println(num1+"*"+num2+"="+util.multiply(num1,num2));
        System.out.println(num1+"/"+num2+"="+util.divide(num1,num2));
        System.out.println(5+"! = "+util.factorial(5));
        System.out.println(123+" reversed digits= "+util.reversedigits(123));




    }
}
