package com.khalid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {
    public static void main(String[] args) {
        //Example 1
        /*
        ArrayList<Integer> numbersList=new ArrayList<Integer>();
        numbersList.add(10);
        numbersList.add(15);
        numbersList.add(20);
        numbersList.add(25);
        numbersList.add(30);
        */
        List<Integer> numbersList= Arrays.asList(10,15,20,25,30);

        List<Integer> evenNumbersList=new ArrayList<Integer>();

        //! Enhance for loop
        /*
        for(Integer number:numbersList){
            if(number%2==0){
                evenNumbersList.add(number);
            }
        }
        System.out.println(evenNumbersList);
        */

        //! Using streams concept
        evenNumbersList=numbersList.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println(evenNumbersList);

        //! If we don't want to store the data after processing
        numbersList.stream().filter(x->x%2==0).forEach(x-> System.out.print(x+" "));
        numbersList.stream().filter(x->x%2==0).forEach(System.out::print);

        List<String> names=Arrays.asList("Khalid","Ahmad","Adnan","Jeffrey","Harshit shah");
        List<String> longNames=new ArrayList<>();

        longNames=names.stream().filter(x->x.length()>6 && x.length()<8).collect(Collectors.toList());
        System.out.println(longNames);

        names.stream().filter(x->x.length()>6 && x.length()<8).forEach(x-> System.out.println(x));




    }
}
