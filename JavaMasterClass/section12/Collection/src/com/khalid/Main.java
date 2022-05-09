package com.khalid;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        Theatre theatre=new Theatre("Olympian",8,12);
//        List<Theatre.Seat> seatCopy=new ArrayList<>(theatre.seats);
//        printList(seatCopy);
//        seatCopy.get(1).reserve();
//
//                if(theatre.reserveSeat("A02")){
//                    System.out.println("Please pay");
//                }
//                else {
//                    System.out.println("Sorry seat is taken");
//                }
//                Collections.shuffle(seatCopy);
//                System.out.println("Printing seatCopy");
//                printList(seatCopy);
//                System.out.println("Printing theatre.seat");
//                printList(theatre.seats);
//
//                Theatre.Seat minSeat=Collections.min(seatCopy);
//                Theatre.Seat maxSeat=Collections.max(seatCopy);
//                System.out.println("Min seat number is "+minSeat.getSeatNumber());
//                System.out.println("Max seat number is "+maxSeat.getSeatNumber());
//
//                sortList(seatCopy);
//                System.out.println("Printing sorted seatCopy");
//                printList(seatCopy);
//
//                List<Theatre.Seat> newList=new ArrayList<>();
//                Collections.copy(newList,seatCopy);

//        List<Theatre.Seat> priceSeats=new ArrayList<>(theatre.getSeats());
//        priceSeats.add(theatre.new Seat("B00",13.00));
//        priceSeats.add(theatre.new Seat("A00",13.00));
//        Collections.sort(priceSeats,Theatre.PRICE_ORDER);
//        printList(priceSeats);

           MapProgram.main(new String[]{});


    }
    public static void printList(List<Theatre.Seat> list){
        for(Theatre.Seat seat:list){
            System.out.print(" "+seat.getSeatNumber()+" $"+seat.getPrice());
        }
        System.out.println();
        System.out.println("=========================================================");
    }
    public static void sortList(List<? extends Theatre.Seat> list){
        for (int i=0;i<list.size()-1;++i){
            for (int j=i+1;j< list.size();++j){
                if(list.get(i).compareTo(list.get(j))>0){
                    Collections.swap(list,i,j);
                }
            }
        }
    }
}