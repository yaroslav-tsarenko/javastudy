package org.example.sockets;

import java.rmi.*;

public class MyRemoteClient {
    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    public void go() {
        try {
            MyRemoteClient service = (MyRemoteClient) Naming.lookup("rmi://127.0.0.1/Remote Hello");
            String s = service.sayHello();
            System.out.println(s);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public String sayHello() {
        System.out.println("Hello");
        return null;
    }
}
