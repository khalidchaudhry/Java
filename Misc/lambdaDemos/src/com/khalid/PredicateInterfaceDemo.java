package com.khalid;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInterfaceDemo {
    public static void main(String[] args) {

        //+ Example 1
        Predicate<Integer> example1=(x)->x>10;;
        System.out.println(example1.test(9));//false
        System.out.println(example1.test(100));//true

        //+ Example 2 Check the string length is >4
        Predicate<String> example2=(x)->x.length()>4;
        List<String> arrayList=new ArrayList<>();
        arrayList.add("test1");
        arrayList.add("Hello");
        arrayList.add("a");
        for(String s:arrayList){
            if(example2.test(s)){
                System.out.println(s);
            }
        }

        //+ Example 3 emp object if salary is greater then 30K
        Predicate<Employee> example3=x->x.salary>90000;
        List<Employee> employees=new ArrayList<>();
        employees.add(new Employee("Khalid",40,100000));
        employees.add(new Employee("Hassan",40,90000));
        employees.add(new Employee("Safina",30,50000));
        for(Employee e : employees){
            if(example3.test(e)){
                System.out.println(e);
            }
        }
        //+ joining predicates together
        Predicate<Integer> evenNumber=x->x%2==0;
        Predicate<Integer> greaterThen50=x->x>50;

        List<Integer> integers=new ArrayList<>();
        integers.add(10);
        integers.add(100);
        integers.add(500);
        for(Integer i:integers){
            if(evenNumber.and(greaterThen50).test(i)){
                System.out.println(i);
            }
        }
    }
}
class Employee{
    String name;
    int age;
    int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}


