package com.khalid;

public class LambdaWithNoParams {
    public static void main(String[] args) {

        Cab b=()->System.out.println("Ola cab is booked");
        b.bookCab();


    }
}

interface Cab{
    public void bookCab();
}
//class Ola implements Cab{
//    public void bookCab() {
//        System.out.println("Ola cab is booked");
//    }
    /*
        ()->System.out.println("Ola cab is booked");
    */
//}

