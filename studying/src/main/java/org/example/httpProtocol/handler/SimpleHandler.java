package org.example.httpProtocol.handler;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.http.model.User;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import org.example.httpProtocol.model.User;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

public class SimpleHandler implements HttpHandler {

   private final Set<User> users = new HashSet<>();

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        switch (exchange.getRequestMethod()) {
            case "GET":
                handleGet(exchange);
                break;
        }
    }

    private void handlePost(HttpExchange exchange) throws IOException {

        OutputStream responseBody = exchange.getResponseBody();

        int OK_STATUS = 200;

        if (exchange.getRequestURI().toString().equals("/users")) {
            byte[] bytes = exchange.getRequestBody().readAllBytes();
            User user = createGson().fromJson(new String(bytes), User.class);
            byte[] message = createMessage(user);
            exchange.sendResponseHeaders(OK_STATUS, message.length);
            responseBody.write(message);
        }
        responseBody.flush();
        responseBody.close();
    }

    private void handleGet(HttpExchange exchange) throws IOException {

        OutputStream responseBody = exchange.getResponseBody();

        String ok = "OK";
        String testPoint = "TEST";
        int OK_STATUS = 200;

        if (exchange.getRequestURI().toString().equals("/status")) {
            exchange.sendResponseHeaders(200, ok.getBytes().length);
            responseBody.write(ok.getBytes(StandardCharsets.UTF_8));
        }

        if (exchange.getRequestURI().toString().equals("/test")) {
            exchange.sendResponseHeaders(OK_STATUS, testPoint.getBytes().length);
            responseBody.write(testPoint.getBytes(StandardCharsets.UTF_8));
        }

        if (exchange.getRequestURI().toString().equals("/users")) {
            byte[] message = createMessage(users);
            exchange.sendResponseHeaders(OK_STATUS, testPoint.getBytes().length);
            responseBody.write(createMessage(users));
        }

        responseBody.flush();
        responseBody.close();
    }

    private byte[] createMessage(Object obj){
        return createGson()
                .toJson(obj)
                .getBytes(StandardCharsets.UTF_8);
    }

    private Gson createGson(){
        return new GsonBuilder()
                .setPrettyPrinting()
                .create();
    }
}
