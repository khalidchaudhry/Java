package com.khalid;

import java.util.function.Function;

public class FunctionInterfaceDemo {

    public static void main(String[] args) {

        //+ Example 1 Take square root of number
        Function<Integer,Integer> square=x->x*x;
        System.out.println(square.apply(10));

        //+ Example 2: Pass string and get string length
        Function<String,Integer> stringLength=x->x.length();
        System.out.println(stringLength.apply("Hello"));

        //+ Function chaining
        Function<Integer,Integer> f1=n->n*n;
        Function<Integer,Integer> f2=n->n*n*n;

        System.out.println(f1.andThen(f2).apply(2));



    }
}
