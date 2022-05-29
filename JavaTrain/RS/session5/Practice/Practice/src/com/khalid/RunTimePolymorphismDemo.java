package com.khalid;

public class RunTimePolymorphismDemo {
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.move();
        Animal animal2=new Dog();
        //! Runtime polymorphism/dynamic dispatch service
        animal2.move();


    }

}

class Animal{
    public void move() {
        System.out.println("Animal move");
    }
}
class Dog extends Animal{

    public void move(){
        System.out.println("Dog move");
    }
}




