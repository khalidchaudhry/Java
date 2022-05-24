package com.khalid;

public class LambdaWithParameters {
    public static void main(String[] args) {
        Cab2 cab=(String source,String destination)->
            System.out.println("Cab booked from "+source+ " to "+ destination);
         cab.BookCab("Lahore","Islamabad");
    }

}

interface Cab2{
    void BookCab(String source,String destination);
}