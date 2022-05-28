package com.khalid;

public class Main {
    public static void main(String[] args) {
        
        Bank boa=new BankOfAmerica();
        System.out.println(boa.getRateOfInterest());
        Bank citiBank=new CitiBank();
        System.out.println(citiBank.getRateOfInterest());
        Bank chaseBank=new ChaseBank();
        System.out.println(chaseBank.getRateOfInterest());

    }
}