package com.khalid;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class MyClient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 3333);
            DataInputStream din=new DataInputStream(s.getInputStream());
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String str="";
            String str2="";
            while (!str.equals("stop")){
                str=br.readLine();
                dout.writeUTF(str);
                str2=din.readUTF();
                System.out.println("Server says:"+str2);
            }
            dout.close();
            s.close();

        }catch (Exception e){

        }

    }
}
