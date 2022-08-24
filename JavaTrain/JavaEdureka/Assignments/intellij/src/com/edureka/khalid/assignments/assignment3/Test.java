package com.edureka.khalid.assignments.assignment3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Enter account type tobe created");
        System.out.println("1----------Savings Account");
        System.out.println("2----------Checking Account");
        Scanner scanner=new Scanner(System.in);
        Account account=null;

        int input=scanner.nextInt();
        if(input==1){
            account=new SBAccount(10);
        }else if(input==2){
            account=new CurrentAccount(20);
        }else{
            System.out.println("Wrong input.Try again");
        }
    }
}
