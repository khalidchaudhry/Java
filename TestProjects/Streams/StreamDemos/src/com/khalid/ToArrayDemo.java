package com.khalid;

import java.util.Arrays;
import java.util.List;

public class ToArrayDemo {

    public static void main(String[] args) {
        List<String> numbersList= Arrays.asList("Hello","World");

        Object arr[]=numbersList.stream().toArray();
        System.out.println(arr);
    }
}
