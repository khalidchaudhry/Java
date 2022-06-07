package com.khalid;

public class Main {

    public static void main(String[] args) {
        int age=12;

        try{
            validateAge(age);
       }catch (InvalidAgeException e){
            System.out.println(e);
        }
        System.out.println("Code after try ,catch");
    }
    private static void validateAge(int age) {

        if(age<18){
           throw new InvalidAgeException("Age is not valid");
        }
    }

}