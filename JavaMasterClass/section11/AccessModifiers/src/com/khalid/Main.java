package com.khalid;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Account khalidAccount=new Account("Khalid");
        khalidAccount.deposit(1000);
        khalidAccount.withdraw(500);
        khalidAccount.withdraw(-200);
        khalidAccount.deposit(-20);
        khalidAccount.calculateBalance();
        System.out.println("Balance on account is "+khalidAccount.getBalance());
    }
}