package com.khalid;

public class Main{
    public static void main(String[] args) {
        //System.out.println("Hello world!");
//        SomeClass one=new SomeClass("one");
//        SomeClass two=new SomeClass("two");
//        SomeClass three=new SomeClass("three");
//
//        System.out.println(one.getInstanceNumber());
//
//        System.out.println(two.getInstanceNumber());
//
//        System.out.println(three.getInstanceNumber());
//
//        System.out.println(Math.PI);
//        int pw=674312;
//        Password password=new Password(pw);
//        password.storePassword();
//        password.letMeIn(1);
//
//        password.letMeIn(2);
//
//
        System.out.println("Main method called");
        SIBTest test=new SIBTest();
        test.someMethod();
        System.out.println("Owner is "+SIBTest.owner );



    }
}