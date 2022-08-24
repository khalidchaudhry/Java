package com.khalid;

import java.io.DataOutputStream;
import java.net.Socket;

public class MyClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 6666);
            DataOutputStream dout=new DataOutputStream(socket.getOutputStream());
            dout.writeUTF("Hello Server");
            dout.flush();
            socket.close();

        }catch (Exception ex){
            System.out.println(ex);
        }


    }
}
