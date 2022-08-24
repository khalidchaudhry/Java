package com.edureka.khalid.assignments.assignment3;

public final class SBAccount extends Account {
    private final double minBalance=10;
    private final double interestrate =4;

    public SBAccount(int amount) {
        if(amount<minBalance){
            System.out.println("Require "+minBalance+ "to open the acount");
        }else {
            deposit(amount);
            System.out.println("Successfully created Saving account");
        }
    }

    @Override
    void deposit(double amount) {
        this.amount+=amount;
        System.out.println(amount+" deposited successfully");
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
    public double getInterestrate() {
        return interestrate;
    }
}
