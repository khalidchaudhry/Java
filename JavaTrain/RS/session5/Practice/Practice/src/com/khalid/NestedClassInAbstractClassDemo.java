package com.khalid;

public class NestedClassInAbstractClassDemo {

    public static void main(String[] args) {
        AbstractClass.InnerClass.InnerClassStaticMethod();
    }
}

abstract class AbstractClass {

        private static void privatestaticmethod() {
        System.out.println("private method");
    }
    public  static class InnerClass {

        public  static void InnerClassStaticMethod() {
            System.out.println("Inner class Method");
            privatestaticmethod();
        }
    }
}


