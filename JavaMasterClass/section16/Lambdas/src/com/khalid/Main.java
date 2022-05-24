package com.khalid;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Printing from the Runnable");
//            }
//        }).start();

//        new Thread(()-> {
//            System.out.println("Printing from the Runnable");
//            System.out.println("Line 2");
//            System.out.println("This is line 3");
//
//        }).start();

        List<Employee> employees=new ArrayList<>();

        Employee khalid=new Employee("Khalid Chaudhry",38);
        Employee amit=new Employee("Amit",48);
        Employee jack=new Employee("Jack",40);
        Employee snow=new Employee("Snow",50);

        employees.add(khalid);
        employees.add(amit);
        employees.add(jack);
        employees.add(snow);

//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
//         Collections.sort(employees,(employee1,employee2)->
//               employee1.getName().compareTo(employee2.getName()));
//
//        for(Employee employee:employees){
//            System.out.println(employee.getName());
//        }
//        String sillyString=doStringStuff(new UpperConcat() {
//            @Override
//            public String upperAndConcat(String s1, String s2) {
//                return s1.toUpperCase()+s2.toUpperCase();
//            }
//        },employees.get(0).getName(),employees.get(1).getName());

        //System.out.println(sillyString);

//        UpperConcat uc=(s1,s2)->{
//            String result=s1.toUpperCase()+s2.toUpperCase();
//            return result;
//        };
//        String sillyString=doStringStuff(uc,employees.get(0).getName(),employees.get(1).getName());
//        System.out.println(sillyString);

        AnotherClass anotherClass=new AnotherClass();
        String s=anotherClass.doSomething();
        System.out.println(s);

    }
    public static final String doStringStuff(UpperConcat uc, String s1, String s2){
        return uc.upperAndConcat(s1,s2);
    }
}

class CodeToRun implements Runnable{


    @Override
    public void run() {
        System.out.println("Printing from the Runnable");
    }
}

class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
interface UpperConcat {
    public String upperAndConcat(String s1,String s2);
}
class AnotherClass{
    public String doSomething(){
        int i=0;
        {
            UpperConcat uc = (s1, s2) -> {
                System.out.println("The lambda expression's class is " + getClass().getSimpleName());
                String result = s1.toUpperCase() + s2.toUpperCase();
                return result;
            };
            System.out.println("The AnotherClass class's name is " + getClass().getSimpleName());
            return Main.doStringStuff(uc, "String1", "String2");
        }
    }
}