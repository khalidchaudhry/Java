package com.khalid;

import static com.khalid.ThreadColor.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE+"Hello from main thread");

        Thread anotherTread=new AnotherThread();
        anotherTread.setName("==AnotherThread==");
        anotherTread.start();

        new Thread(){
            public void run(){
                System.out.println(ANSI_GREEN+"Hello from the anonymous class thread");
            }
        }.start();

//        Thread myRunnableThread=new Thread(new MyRunnable());
//        myRunnableThread.start();

        Thread myRunnableThread=new Thread(new MyRunnable(){
           @Override
           public void run(){
               //super.run();
               System.out.println(ANSI_RED+"Hello from anonymous class implementation of run");
               try {
                   // We want current thread to join anotherThread
                   anotherTread.join(2000);
                   System.out.println(ANSI_RED+"AnotherThread terminated, or timed out, so I'm running again");
               }catch (InterruptedException e){
                   System.out.println(ANSI_RED+"I could not wait after all. I was interrupted");
               }
           }
        });
        myRunnableThread.start();
        //anotherTread.interrupt();

        System.out.println(ANSI_PURPLE+"Hello again from the main thread");
    }
}