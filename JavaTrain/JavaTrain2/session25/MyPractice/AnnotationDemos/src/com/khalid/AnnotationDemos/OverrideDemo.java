package com.khalid.AnnotationDemos;

public class OverrideDemo {
    public static void main(String[] args) {
        Animal animal=new Dog(); //upcasting Dog to Animal
        animal.eatSomething();
        Dog dog=(Dog)animal;//down casting Animal to dog
        dog.eatSomething();


    }
}
class Animal {
    void eatSomething() {
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal {
    @Override
    void eatSomething() {
        System.out.println("Dog is eating");
    }
}





