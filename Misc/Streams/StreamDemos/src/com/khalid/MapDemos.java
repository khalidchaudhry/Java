package com.khalid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemos {
    public static void main(String[] args) {
        List<String> vehicles= Arrays.asList("bus","car","flight","train");

        //! Upper case all the words in Arrays.asList
        List<String> vehiclesUpperCase=vehicles.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
        System.out.println(vehiclesUpperCase);

        //! Find the length of vehicle names
        vehicles.stream().map(x->x.length()).forEach(x-> System.out.print(x+" "));
        vehicles.stream().map(x->x.length()).forEach(System.out::print);

        System.out.println();

        //!Take every element from collection and multiply by three
        List<Integer> numbersList=Arrays.asList(2,3,4,5);
        numbersList.stream().map(x->x*3).forEach(System.out::println);

        //! Using filter and map together
        List<Employee> employeeList= Arrays.asList(
                         new Employee(1,"Khalid",30000),
                         new Employee(2,"Ahsan",6000),
                         new Employee(3,"Naveed",70000)
                );

     var salaries=employeeList.stream()
             .filter(e->e.salary>20000)
             .map(e->e.salary)
             .collect(Collectors.toList());

        var salaries2=employeeList.stream()
                .filter(e->e.salary>20000)
                .map((e)->{
                    e.salary=e.salary*100;
                    return e;
                }
                ).collect(Collectors.toList());
        System.out.println(salaries2);

    }
    static class Employee{
        int empid;
        String empname;
        int salary;

        public Employee(int empid, String empname, int salary) {
            this.empid = empid;
            this.empname = empname;
            this.salary = salary;
        }
    }
}
