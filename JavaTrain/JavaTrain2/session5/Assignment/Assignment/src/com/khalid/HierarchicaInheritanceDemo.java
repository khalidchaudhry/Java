package com.khalid;

public class HierarchicaInheritanceDemo {
    public static void main(String[] args) {
        A classA=new A();

        //! Run time polymorhism/dynamic dispatch method
        A classB=new B();

        classB.classAName();

    }
}
class A
{
    public void classAName(){
        System.out.println("Class A name");
    }
}
class B extends A
{
}
class C extends A
{
}
class D extends B
{
}
class E extends B
{
}
class F extends C
{

}
class G extends C
{

}