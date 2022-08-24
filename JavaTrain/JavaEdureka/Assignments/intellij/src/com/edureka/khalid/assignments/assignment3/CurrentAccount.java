package com.edureka.khalid.assignments.assignment3;

public final class CurrentAccount extends Account {
    private final double minBalance=20;

    public CurrentAccount(int amount) {
        if(amount<minBalance){
            System.out.println("Require "+minBalance+ "to open the acount");
        }else {
            deposit(amount);
            System.out.println("Successfully created Current account");
        }
    }
    @Override
    void deposit(double amount) {
        this.amount+=amount;
    }
    @Override
    void withdraw(double amount) {
        if(this.amount-amount<=minBalance){
            System.out.println("withdraw failed");
            System.out.println("Requested withdraw amount will leave account balance <="+minBalance);
        }else {
            this.amount-=amount;
        }
    }
}
