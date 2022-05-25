package com.khalid;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedMethodDemo {
    public static void main(String[] args) {
        List<Integer> lst1= Arrays.asList(2,1,6,7,8);
        System.out.println(lst1);
        //! In ascending order
        List<Integer> result=lst1.stream().sorted().collect(Collectors.toList());
        System.out.println(result);
        //! In descending order
        List<Integer> result2=lst1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(result2);


    }
}
