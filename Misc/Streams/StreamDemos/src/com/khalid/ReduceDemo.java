package com.khalid;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {
    public static void main(String[] args) {
        List<String> numbersList= Arrays.asList("Hello","World");
        Optional<String> reduced=numbersList.stream().reduce((value, combinedValue)->{
           return combinedValue+value;
        });
        System.out.println(reduced.get());


    }
}
