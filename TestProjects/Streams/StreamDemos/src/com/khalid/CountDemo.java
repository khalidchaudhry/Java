package com.khalid;

import java.util.Arrays;
import java.util.List;

public class CountDemo {
    public static void main(String[] args) {
        List<String> vehiclesList= Arrays.asList("bus","car","bicycle","car");

        long count=vehiclesList.stream().distinct().count();
        System.out.println(count);

    }
}
