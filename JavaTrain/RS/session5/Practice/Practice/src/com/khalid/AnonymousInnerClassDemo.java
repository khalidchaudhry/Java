package com.khalid;

public class AnonymousInnerClassDemo {
    public static void main(String[] args) {
        Person p=new Person() {
            @Override
            void eat() {
                System.out.println("eat from anonymous inner class");
            }
        };
        p.eat();

    }
}


abstract class Person{
    abstract void eat();
}

