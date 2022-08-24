package com.khalid;

public class Main {
    public static void main(String[] args) {
        OmitAccessModifier omitAccessModifier=new Test();
        omitAccessModifier.method1();
        System.out.println(omitAccessModifier.var);

        OmitAccessModifier omitAccessModifier2=new Test();
        System.out.println(omitAccessModifier2.var);

    }
}