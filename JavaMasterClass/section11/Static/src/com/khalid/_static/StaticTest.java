package com.khalid._static;

public class StaticTest {
    private  static int numInstances;
    private String name;

    public StaticTest(String name) {
        this.name = name;
        numInstances++;
    }
    public static int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }


}
