package com.khalid;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitDemo {
    public static void main(String[] args) {
        List<String> vehiclesList= Arrays.asList("bus","car","bicycle","car");

        List<String> limitVehicles=vehiclesList.stream().limit(3).collect(Collectors.toList());
        System.out.println(limitVehicles);

    }
}
