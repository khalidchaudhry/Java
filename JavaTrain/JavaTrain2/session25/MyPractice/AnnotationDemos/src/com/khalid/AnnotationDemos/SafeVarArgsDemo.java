package com.khalid.AnnotationDemos;

import java.util.ArrayList;
import java.util.List;

public class SafeVarArgsDemo {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("Khalid");
        names.add("Ahmad");
        names.add("Bilal");
        SafeVarArgsDemo demo=new SafeVarArgsDemo();
        demo.print(names);
    }
    //@SafeVarargs
    private void print(List<String> ... names){

        for(List<String> name:names){
            System.out.println(name);
        }
    }
}