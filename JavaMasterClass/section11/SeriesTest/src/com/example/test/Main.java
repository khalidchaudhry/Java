package com.example.test;

import com.khalid.mylibrary.Series;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        for(int i=0;i<=10;++i){
            System.out.println(Series.nSum(i));
        }
        for(int i=0;i<=10;++i){
            System.out.println(Series.factorial(i));
        }
    }
}