package com.khalid;

public class RegularInnerClassDemo {
    public static void main(String[] args) {
        OuterClass outerClassObj=new OuterClass();
        OuterClass.InnerClass innerClassObj=outerClassObj.new InnerClass();
        innerClassObj.innerclassmethod();
    }
}

class OuterClass {

    private int outerclassVariable;

     OuterClass() {
        outerclassVariable=100;
    }

    OuterClass(int outerclassVariable) {
        this.outerclassVariable = outerclassVariable;
    }

    void outerclassmethod() {
        System.out.println("Cannot access inner class variable from outer class");
    }

     class InnerClass {
        int innerClassVariable;

        void innerclassmethod() {
            System.out.println("Accessed outerclassVar(outer class variable) from inner class:" + outerclassVariable);

        }

    }

}
