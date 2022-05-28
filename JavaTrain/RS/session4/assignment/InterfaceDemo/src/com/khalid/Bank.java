package com.khalid;

public interface Bank {

    int getRateOfInterest();
    default void deposit(double amount) {
    }
    default void withdraw(double amount){
    }
}
