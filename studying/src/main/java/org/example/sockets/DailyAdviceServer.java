package org.example.sockets;

import java.io.*;
import java.net.*;

public class DailyAdviceServer {

    String[] adviceList = {"Eat less", "Buy skinny jeans", "No, it doesn't makes you fat", "Two words: Not good",
            "Be honest, just today", "Say your boss all what you think", "Maybe.. You should change your hairstyle"};

    public void go() {
        try {
            ServerSocket serverSock = new ServerSocket(4242);
            while (true) {
                Socket sock = serverSock.accept();

                PrintWriter writer = new PrintWriter(sock.getOutputStream());
                String advice = getAdvice();
                writer.println();
                writer.close();
                System.out.println(advice);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private String getAdvice(){
        int random = (int) (Math.random() * adviceList.length);
        return adviceList[random];
    }

    public static void main(String[] args) {
        DailyAdviceServer server = new DailyAdviceServer();
        server.go();
    }
}