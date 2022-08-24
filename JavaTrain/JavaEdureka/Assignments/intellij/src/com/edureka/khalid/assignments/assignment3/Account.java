package com.edureka.khalid.assignments.assignment3;

public abstract class Account {
    int accountNumber;
    String name;
    double amount;
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}
