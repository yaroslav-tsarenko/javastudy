package org.example.httpProtocol.handler;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import org.example.httpProtocol.model.User;
import org.example.httpProtocol.repository.UserRepository;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.Optional;

public class SimpleHandler implements HttpHandler {

    private final UserRepository userRepository;

    public SimpleHandler(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * Handle the given request and generate an appropriate response.
     * See {@link HttpExchange} for a description of the steps
     * involved in handling an exchange.
     *
     * @param exchange the exchange containing the request from the
     *                 client and used to send the response
     * @throws NullPointerException if exchange is <code>null</code>
     */
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        switch (exchange.getRequestMethod()) {
            case "GET":
                handleGet(exchange);
                break;
            case "POST":
                handlePost(exchange);
                break;
            case "PUT":
                handlePut(exchange);
                break;
        }
    }

    private void handlePost(HttpExchange exchange) throws IOException {
        OutputStream responseBody = exchange.getResponseBody();

        int OK_STATUS = 200;

        if (exchange.getRequestURI().toString().equals("/users")) {
            byte[] bytes = exchange.getRequestBody().readAllBytes();
            User user = createGson().fromJson(new String(bytes), User.class);
            User savedUser = userRepository.save(user);
            byte[] message = createMessage(savedUser);
            exchange.sendResponseHeaders(OK_STATUS, message.length);
            responseBody.write(message);
        }
        responseBody.flush();
        responseBody.close();
    }

    private void handleGet(HttpExchange exchange) throws IOException {
        OutputStream responseBody = exchange.getResponseBody();
        String ok = "OK";
        String testEndpoint = "TEST";


        int OK_STATUS = 200;
        if (exchange.getRequestURI().toString().equals("/status")) {
            exchange.sendResponseHeaders(OK_STATUS, ok.getBytes().length);
            responseBody.write(ok.getBytes(StandardCharsets.UTF_8));
        }

        if (exchange.getRequestURI().toString().equals("/test")) {
            exchange.sendResponseHeaders(OK_STATUS, testEndpoint.getBytes().length);
            responseBody.write(testEndpoint.getBytes(StandardCharsets.UTF_8));
        }

        if (exchange.getRequestURI().toString().equals("/users")) {
            byte[] message = createMessage(userRepository.findAll());
            exchange.sendResponseHeaders(OK_STATUS, message.length);
            responseBody.write(message);
        }
        responseBody.flush();
        responseBody.close();
    }

    private void handlePut(HttpExchange exchange) throws IOException {
        OutputStream responseBody = exchange.getResponseBody();

        int OK_STATUS = 200;

        if (exchange.getRequestURI().toString().equals("/users")) {
            byte[] bytes = exchange.getRequestBody().readAllBytes();
            User user = createGson().fromJson(new String(bytes), User.class);
            User updated = userRepository.update(user);
            byte[] message = createMessage(updated);
            exchange.sendResponseHeaders(OK_STATUS, message.length);
            responseBody.write(message);
        }
        responseBody.flush();
        responseBody.close();
    }

    private byte[] createMessage(Object obj) {
        return createGson()
                .toJson(obj)
                .getBytes(StandardCharsets.UTF_8);
    }

    private Gson createGson() {
        return new GsonBuilder()
                .setPrettyPrinting()
                .serializeNulls()
                .create();

    }
}
