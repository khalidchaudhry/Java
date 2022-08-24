package com.edureka.khalid.assignments.assignment4.packageassignment;

public class MathUtil {
    public int subtract(int num1,int num2){
        return num1-num2;
    }
    public int multiply(int num1,int num2){
        return num1*num2;
    }
    public int divide(int dividend,int divisor){
        return dividend/divisor;
    }
    public int factorial(int num){
        int factorial=num;
        for(int i=num-1;i>1;--i){
            factorial*=i;
        }
        return factorial;
    }
    public int reversedigits(int number){
        int reverseNumber=0;
        while (number>0){

            int remainder=number%10;
            int quotient=number/10;
            reverseNumber=reverseNumber*10+remainder;
            number=quotient;
        }
        return reverseNumber;
    }

}
