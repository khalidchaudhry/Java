package com.edureka.khalid.assignments.assignment5;

import java.util.*;

public class CollectionsAssignments {
    public static void main(String[] args) {
        arrayListDemo();
        hashmapDemo();
        hashtableDemo();
    }

    public static void arrayListDemo(){

        System.out.println("********ArrayList assignment********");

        List<Integer> list=new ArrayList();
        for(int i=1;i<=10;++i){
            list.add(i);
        }

        Iterator<Integer> iterator= list.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
    public static void hashmapDemo(){
        System.out.println();
        System.out.println("********Hashmap assignment********");
         class Employee{
            int employeeId;
            String employeeName;
            int age;
             @Override
             public String toString() {
                 return "Id:"+employeeId+"\t"+"Name:"+employeeName+"\t"+"Age:"+age;
             }

             public Employee(int employeeId, String employeeName, int age) {
                 this.employeeId = employeeId;
                 this.employeeName = employeeName;
                 this.age = age;
             }
         }
        Map<Integer,Employee> map=new HashMap<>();
        map.put(1,new Employee(1,"John",32));
        map.put(2,new Employee(2,"Kevin",28));
        map.put(3,new Employee(3,"Billy",39));
        map.put(4,new Employee(4,"Tom",50));
        map.put(1,new Employee(1,"Britney",22));
        for(Employee employee:map.values()){
            System.out.println(employee);
        }
    }
    public static void hashtableDemo(){
        System.out.println();
        System.out.println("********Hashtable assignment********");

        class Student {
            int studentId;
            String studentName;
            int age;
            @Override
            public String toString() {
                return "Id:"+ studentId +"\t"+"Name:"+ studentName +"\t"+"Age:"+age;
            }

            public Student(int employeeId, String employeeName, int age) {
                this.studentId = employeeId;
                this.studentName = employeeName;
                this.age = age;
            }
        }
        Map<Integer, Student> map=new Hashtable();
        map.put(1,new Student(1,"John",32));
        map.put(2,new Student(2,"Kevin",28));
        map.put(3,new Student(3,"Billy",39));
        map.put(4,new Student(4,"Tom",50));
        map.put(1,new Student(1,"Britney",22));
        for(Student student:map.values()){
            System.out.println(student);
        }


    }
}
