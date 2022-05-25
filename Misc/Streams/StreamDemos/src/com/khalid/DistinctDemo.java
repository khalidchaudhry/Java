package com.khalid;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctDemo {
    public static void main(String[] args) {
        List<String> vehiclesList= Arrays.asList("bus","car","bicycle","car");
        List<String> distinctVehicles=vehiclesList.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctVehicles);

        vehiclesList.stream().distinct().forEach(x-> System.out.println(x));

    }
}
