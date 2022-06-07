package com.khalid;

public class IIBDemo {
    //Instance initialization block
    {
        System.out.println("Instance initialization block");
    }
    IIBDemo(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        IIBDemo demo=new IIBDemo();
    }
}
