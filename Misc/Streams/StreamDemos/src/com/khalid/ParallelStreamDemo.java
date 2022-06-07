package com.khalid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student{
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public String getName(){
        return this.name;
    }
    public int getScore(){
        return this.score;
    }
}
public class ParallelStreamDemo {
    public static void main(String[] args) {
        List<Student> studentList= Arrays.asList(
                new Student("David",82),
                new Student("John",65),
                new Student("Canedy",55),
                new Student("Eric",85),
                new Student("Smith",88),
                new Student("Scott",50)
                );
        //! Using stream -sequential
        studentList.stream().filter(x->x.getScore()>=80)
                            .limit(3)
                            .forEach(x-> System.out.println(x.getName()+" "+x.getScore()));
        //!parallel stream
        studentList.parallelStream().filter(x->x.getScore()>=80)
                .limit(3)
                .forEach(x-> System.out.println(x.getName()+" "+x.getScore()));
        //!Convert stream to parallel stream
        studentList.stream()
                .parallel()
                .filter(x->x.getScore()>=80)
                .limit(3)
                .forEach(x-> System.out.println(x.getName()+" "+x.getScore()));




    }
}
