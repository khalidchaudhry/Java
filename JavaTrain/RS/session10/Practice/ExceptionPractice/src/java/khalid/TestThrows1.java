package java.khalid;

import java.io.IOException;

public class TestThrows1 {


    public static void main(String[] args) {
        TestThrows1 obj=new TestThrows1();
        obj.p();

        System.out.println("normal flow");

    }
    void m() throws IOException{
        throw new IOException("device error");
    }
    void n() throws IOException{
        m();
    }
    void p(){
        try {
            n();
        }catch (Exception e){
            System.out.println("exception handled");
        }
    }
}
