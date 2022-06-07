package com.khalid;

public class RunTimePolymorphismDemo {
    public static void main(String[] args) {
        Animal dog=new Dog();
        dog.eat();

        Animal cat=new Cat();
        cat.eat();

        Animal horse=new Horse();
        horse.eat();


    }
}

class Animal{

    void eat(){
        System.out.println("Nothing is eating");
    }
}

class Cat extends Animal {

    @Override
    void eat() {
        System.out.println("Cat is eating");
    }
}

class Dog extends Animal{
    @Override
    void eat() {
        System.out.println("Dog is eating");
    }
}
class Horse extends Animal{

    @Override
    void eat() {
        System.out.println("Horse is eating");
    }
}