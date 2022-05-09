package com.khalid;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        String varFour="this is private to main()";
        ScopeCheck scopeInstance=new ScopeCheck();
        scopeInstance.useInnerClass();
        System.out.println("ScopeInstance varOne is "+ scopeInstance.getVarOne());
        System.out.println(varFour);

        scopeInstance.timesTwo();
        System.out.println("**************************************");
         ScopeCheck.InnerClass innerClass=scopeInstance.new InnerClass();
         innerClass.timesTwo();
        //System.out.println("varThree is not accessible here"+innerClass.varThree);

    }
}