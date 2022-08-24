package com.khalid;

public class NumberFormatExceptionAssignment {
    public static void main(String[] args) {
        String str="asdb";
        try {
            int number=Integer.parseInt(str);
        }
        catch (NumberFormatException e){
            System.out.println("Unable to parse string to integer");
            System.out.println(e);
        }
        System.out.println("Rest of the code");


    }

}
