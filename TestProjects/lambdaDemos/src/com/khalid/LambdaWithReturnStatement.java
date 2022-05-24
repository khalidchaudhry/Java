package com.khalid;

public class LambdaWithReturnStatement {
    public static void main(String[] args) {

        Cab3 cab3=(String source,String destination)->{
            System.out.println("Cab booked from "+source+ " to " +destination);
            return "Rs 100";
        };
        System.out.println(cab3.bookCab("Lahore","Islamabad"));
    }
}
interface Cab3{
    String bookCab(String source,String destination);
}