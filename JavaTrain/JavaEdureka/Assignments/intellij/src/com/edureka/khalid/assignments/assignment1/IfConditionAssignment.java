package com.edureka.khalid.assignments.assignment1;

import java.util.Scanner;

public class IfConditionAssignment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        voteEligibility(scanner);
        numberPositiveOrNegative(scanner);
        numberPositiveNegativeZero(scanner);
        largestOfTwoNumbers(scanner);
        evenOddNumber(scanner);


    }

    private static void evenOddNumber(Scanner scanner) {
        System.out.println("Enter number");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Number:" + number + " is even");
        } else {
            System.out.println("Number:" + number + " is odd");
        }
    }

    private static void largestOfTwoNumbers(Scanner scanner) {
        System.out.println("Enter number1");
        int num1 = scanner.nextInt();
        System.out.println("Enter number2");
        int num2 = scanner.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + " > " + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + ">" + num1);
        } else {
            System.out.println(num1 == num2);
        }
    }

    private static void numberPositiveNegativeZero(Scanner scanner) {
        int number;
        System.out.println("Enter number");
        number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Number:" + number + " is negative");
        } else if (number == 0) {
            System.out.println("Number:" + number + " is zero");
        } else {
            System.out.println("Number is positive");
        }
    }

    private static void numberPositiveOrNegative(Scanner scanner) {
        System.out.println("Enter number:");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Number:" + number + " is negative");
        } else {
            System.out.println("Number:" + number + " is positive");
        }
        System.out.println("Enter number:");
    }

    private static void voteEligibility(Scanner scanner) {
        System.out.println("Enter age:");
        int age = scanner.nextInt();
        if (age < 18) {
            System.out.println("Not eligible for voting");
        } else {
            System.out.println("Eligible for voting");
        }
    }
}
