package com.edureka.khalid.assignments.assignment2;

import java.util.Scanner;

public class DataHandlingAndFunctions {
    public DataHandlingAndFunctions(){

    }

    public static void main(String[] args) {
        DataHandlingAndFunctions question1=new DataHandlingAndFunctions();
        question1.Start();
    }
    public  void Start() {

        Scanner scanner=new Scanner(System.in);
        int[] ids=new int[5];
        String[] names=new String[5];
        double[] salaries=new double[5];

        int i=1;
        while (i<=5){
            System.out.println("Enter employee "+i+" ID");
            ids[i-1]=scanner.nextInt();
            System.out.println("Enter employee "+i+" Name");
            names[i-1]=scanner.next();
            System.out.println("Enter employee "+i+" Salary");
            salaries[i-1]=scanner.nextDouble();
            ++i;
        }
        display(ids,names,salaries);

    }
    private void display(int[] ids,String[] names,double[] salaries){
        System.out.println("ID\tName\t\tSalary");
        for(int i=0;i<5;++i){
            System.out.println(String.format("%02d",ids[i])+"\t"+names[i]+"\t\t"+String.format("%.0f", salaries[i]));
        }
    }
    private void display(int[] ids,String[] names){
        System.out.println("ID\tName\t\tSalary");
        for(int i=0;i<5;++i){
            System.out.println(String.format("%02d",ids[i])+"\t"+names[i]+"\t\t");
        }
    }
    private void display(String name,int[] ids,String[] names,double[] salaries){


        for(int i=0;i<names.length;++i){
            if(names[i]==name) {
                System.out.println("ID\tName\t\tSalary");
                System.out.println(String.format("%02d", ids[i]) + "\t" + names[i] + "\t\t" + String.format("%.0f", salaries[i]));
                return;
            }
            }
        System.out.println("Given employee "+name+" does not exist");
    }
    }