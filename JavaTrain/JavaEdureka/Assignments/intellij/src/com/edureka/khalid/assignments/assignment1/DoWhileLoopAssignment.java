package com.edureka.khalid.assignments.assignment1;

import java.util.Scanner;

public class DoWhileLoopAssignment {

    public static void main(String[] args) {
        tenEvenOddNumbers();
        numberFactorial();
        tableFor10();
        addNumberDigits();
        reverseNumber();
        tenFibonacciNumbers();
    }

    private static void tenFibonacciNumbers() {
        System.out.println("10 Fibonacci numbers");
        int num1 = 0;//first fibonacci number
        int num2 = 1;//second fibonacci number
        System.out.print(num1 + ",");
        int i=1;
        do {
            int num3 = num1 + num2;
            if (i == 9) {
                System.out.print(num3);
            } else {
                System.out.print(num3 + ",");
            }
            num1 = num2;
            num2 = num3;
        }while(i<10);
    }

    private static void reverseNumber() {
        System.out.println("Enter number to reverse its digits:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int reverseNumber = 0;
        int i=number;
       do {
            int remainder = i % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            i=1/10;
        }while (i>0);
        System.out.println("Number:" + number + " Reversed number:" + reverseNumber);
    }

    private static void addNumberDigits() {
        System.out.println("Enter number to add its digits:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int digits = 0;
        int i=number;
        do {
            digits += i % 10;
            i = i / 10;
        }while (i>0);
        System.out.println("Digits sum for number:" + number + "=" + digits);
    }

    private static void tableFor10() {
        int tableFor = 10;
        System.out.println("**********Multiplication table of " + tableFor + " *****************");
        int i=1;
        do {
            System.out.println(i + "*" + tableFor + "=" + (i * tableFor));
            ++i;
        }while (i<=10);
    }

    private static void numberFactorial() {
        System.out.println("Enter number to get its factorial:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int factorial = 1;
        int i=number;
        do{
            factorial *= i;
            --i;
        }while (i>=1);
        System.out.println("Factorial of " + number + " =" + factorial);
    }

    private static void tenEvenOddNumbers() {
        int i=1;
        do {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
            if (i == 10) {
                break;
            }
            ++i;
        }while (i<100);
    }
}
