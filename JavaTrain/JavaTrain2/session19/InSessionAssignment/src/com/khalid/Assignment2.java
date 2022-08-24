package com.khalid;

import java.io.*;

public class Assignment2 {
    public static void main(String[] args) throws Exception {
        Student s1=new Student(1,"Khalid");

        FileOutputStream fo=new FileOutputStream("/Users/khalidchaudhry/MyGithubRepos/Java/JavaTrain/RS/session19/test2.txt");
        ObjectOutputStream os=new ObjectOutputStream(fo);
        os.writeObject(s1);

        FileInputStream fi=new FileInputStream("/Users/khalidchaudhry/MyGithubRepos/Java/JavaTrain/RS/session19/test2.txt");
        ObjectInputStream is=new ObjectInputStream(fi);
        Student s2=(Student)is.readObject();
        System.out.println("Student Id:"+s2.id+" "+"Student name:"+s2.name);



    }


}

class Student implements Serializable {
    int id;
    transient String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;

    }
    }

