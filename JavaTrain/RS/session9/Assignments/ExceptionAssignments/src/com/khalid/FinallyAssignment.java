package com.khalid;

public class FinallyAssignment {
    public static void main(String[] args) {
        int x=50;
        int y=10;
        try{
            int result=x/y;
            System.out.println(result);
        }catch (ArithmeticException e)
        {
            System.out.println("Divide by zero");
            //System.exit(0);
        }
        finally {
            System.out.println("Finally block");
        }

    }
}