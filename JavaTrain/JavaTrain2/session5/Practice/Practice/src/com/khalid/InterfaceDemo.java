package com.khalid;

interface MyInterface{
    //!Allowed in JAVA 7. By default, final
    final int constVar = 0;

    static int staticVar=30;
    //! Allowed in JAVA 7. By default, final
    public abstract void abstractMethod();

    //!Allowed in JAVA 8
    default void defaultMethod(){
        System.out.println("Default method");
    }
    //!Allowed in JAVA 8
    static void staticMethod(){
        System.out.println("Static method");
    }
    //!Allowed in java 9
    private  void privateMethod(){
        System.out.println("private method");
    }
    //!Allowed in JAVA 9
    private static void privateStaticMethod(){
        System.out.println("private static method");
    }
}

public class InterfaceDemo implements MyInterface {
    @Override
    public void abstractMethod() {
        System.out.println("abstract method implementation");
        System.out.println("constVar"+constVar);

    }

    public static void main(String[] args) {
        InterfaceDemo demo=new InterfaceDemo();
        System.out.println(constVar);

    }
}
