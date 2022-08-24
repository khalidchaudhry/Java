package com.khalid;

public class Assignment1 {
    public static void main(String[] args) {

        Employee e1=new Employee(1,"Khalid",200);
        Employee e2=new Employee(101,"Rafikh",220000);

        if(e2.check()){
            System.out.println("e2 is valid user");
        }else {
            System.out.println("e2 is invalid user");
        }


    }

}

class Employee{
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public boolean check(){
        if(this.id==101 &&
                this.name.equals("Rafikh") &&
                this.salary==220000){
            return true;
        }else {
            return false;
        }


    }
}
