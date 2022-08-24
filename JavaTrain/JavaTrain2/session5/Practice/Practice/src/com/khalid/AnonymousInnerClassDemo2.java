package com.khalid;

public class AnonymousInnerClassDemo2 {
    public static void main(String[] args) {
     AnimalClass myAnimal=new AnimalClass();
     myAnimal.makenoise();
     AnimalClass bigFoot=new AnimalClass(){
         @Override
         public void makenoise() {
             System.out.println("Big foot noise");
         }
     };
     bigFoot.makenoise();

     Runnable myAnonymousRunnable=new Runnable() {
         @Override
         public void run() {
             System.out.println("I am anonymous runnable");
         }
     };
     myAnonymousRunnable.run();
    }
}
class AnimalClass{
    public void makenoise(){
        System.out.println("ya ya ya");
    }
}


