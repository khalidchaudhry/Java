package com.khalid;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String,String> languages=new HashMap<>();
        if(languages.containsKey("Java")){
            System.out.println("Java already exists");
        }else{
            languages.put("Java","a compiled high level, object-oriented, platform independent language");
        }
        languages.put("Python","an interpreted, object oriented , high-level programming language");
        languages.put("Algo1","an algorithmic language");
        System.out.println(languages.put("BASIC","Beginners all purpose Symbolic Instruction Code"));
         System.out.println(languages.put("LISP","Therein lies madness"));
        if(languages.containsKey("Java")){
            System.out.println("Java is already in the map");
        }else{
            languages.put("Java","this course is about Java");
        }

        System.out.println("=========================");

        languages.remove("Lisp");
        if(languages.remove("Algo1","an algorithmic language")){
            System.out.println("Algo1 removed");
        }else{
            System.out.println("Algo1 not removed,key/value pair not found");
        }

        System.out.println(languages.replace("LISP","a functional programming language with imperative"));
        System.out.println(languages.replace("Scala","this will not be added"));

        for(String key: languages.keySet())
        {
            System.out.println(key+":"+languages.get(key));
        }


    }
}
