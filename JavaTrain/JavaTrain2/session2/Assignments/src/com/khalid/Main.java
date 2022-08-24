package com.khalid;

public class Main {

    public static void main(String[] args) {
        StaticDemo.staticmethod();
        StaticDemo staticDemo=new StaticDemo();
        staticDemo.nonstaticmethod();

        AccessModifierDemo demo=new AccessModifierDemo();
        demo.privatemethod();


    }
}
