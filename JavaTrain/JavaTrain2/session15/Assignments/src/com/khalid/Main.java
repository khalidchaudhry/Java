package com.khalid;

public class Main {
    public static void main(String[] args) {
        Main main=new Main();
        main=null;
        System.gc();
        System.out.println("End of garbage collection");
    }

    @Override
    protected void finalize(){
        System.out.println("Finalize method called before garbage collection");
        //super.finalize();
    }
}