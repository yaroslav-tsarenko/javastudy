package org.example.httpProtocol;

import com.sun.net.httpserver.HttpServer;
import org.example.httpProtocol.datasource.Datasource;
import org.example.httpProtocol.handler.Logger;
import org.example.httpProtocol.handler.SimpleHandler;
import org.example.httpProtocol.repository.UserContactRepository;
import org.example.httpProtocol.repository.UserProductRepository;
import org.example.httpProtocol.repository.UserRepository;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

public class HttpServerDemo {

    private static final int PORT = 8080;
    private static final int BACKLOG = 0;

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(PORT), BACKLOG);
        Logger log = new Logger();
        Datasource datasource = new Datasource();
        UserRepository userRepository = new UserRepository(datasource);
        UserContactRepository userContactRepository = new UserContactRepository();
        UserProductRepository userProductRepository = new UserProductRepository();
        server.createContext("/", new SimpleHandler(userRepository, userContactRepository, userProductRepository, log));
        server.setExecutor(Executors.newSingleThreadExecutor());
        server.start();
        System.out.println("HTTP server started and listening port: " + PORT);
    }
}
