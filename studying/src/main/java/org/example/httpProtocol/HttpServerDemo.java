package org.example.httpProtocol;

import com.sun.net.httpserver.HttpServer;
import org.example.httpProtocol.handler.SimpleHandler;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

public class HttpServerDemo {

    private static final int PORT = 8080;
    private static final int BACKLOG = 0;

    public static void main(String[] args) throws IOException{
        HttpServer server = HttpServer.create(new InetSocketAddress(PORT), BACKLOG);
        server.createContext("/", new SimpleHandler());
        server.setExecutor(Executors.newSingleThreadExecutor());
        server.start();
        System.out.println("HTTP server started and listening port: " + PORT);
    }
}
