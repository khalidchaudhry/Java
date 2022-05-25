package com.khalid;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ConsumerInterfaceDemo {
    public static void main(String[] args) {

        //+ Example 1
        Consumer<Integer> f1=x-> System.out.println(x);
        f1.accept(30);

        //+ Multiple predefine function interfaces join together
        List<Employee> arrayList=new ArrayList<>();
        arrayList.add(new Employee("Khalid",100000,"Male"));
        arrayList.add(new Employee("Safina",9000,"Male"));
        arrayList.add(new Employee("Abdullah",5000,"Male"));
        arrayList.add(new Employee("David",6000,"Male"));

        //!Function
        Function<Employee,Integer> f2=x->(x.salary*10)/100;  //task 1
        //!Predicate
        Predicate<Integer> p=b->b>=5000; //task 2
        //! Consume
        Consumer<Employee> c=emp->{
            System.out.println(emp.ename);
            System.out.println(emp.salary);
            System.out.println(emp.gender);
            System.out.println("------------");
        };
        for(Employee e:arrayList){
            int bonus=f2.apply(e); //! invoked function
            if(p.test(bonus)){     //!invoked predicate
                c.accept(e);      //! invoked consumer
            }
        }

        //! Consumer chaining
        Consumer<String> c1=s-> System.out.println(s+ " "+" is white");
        Consumer<String> c2=s-> System.out.println(s+" is having four legs");
        Consumer<String> c3=s-> System.out.println(s+" is eating grass");
        Consumer<String> c4=c1.andThen(c2).andThen(c3);
        c4.accept("accept");

//        c1.accept("cow");
//        c2.accept("cow");
//        c3.accept("cow");
        c1.andThen(c2).andThen(c3).accept("cow");



    }

    static class Employee{
        String ename;
        int salary;
        String gender;

        public Employee(String ename, int salary, String gender) {
            this.ename = ename;
            this.salary = salary;
            this.gender = gender;
        }
    }
}

