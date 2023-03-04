package org.example.httpProtocol.handler;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import org.example.httpProtocol.model.Contact;
import org.example.httpProtocol.entity.ProductEntity;
import org.example.httpProtocol.entity.UserEntity;
import org.example.httpProtocol.model.ProductDto;
import org.example.httpProtocol.model.UserDto;
import org.example.httpProtocol.repository.UserContactRepository;
import org.example.httpProtocol.repository.UserProductRepository;
import org.example.httpProtocol.repository.UserRepository;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class SimpleHandler implements HttpHandler {

    private final UserRepository userRepositoryImpl;
    private final UserContactRepository userContactRepository;
    private final UserProductRepository userProductRepository;
    private final Logger log;

    public SimpleHandler(UserRepository userRepositoryImpl, UserContactRepository userContactRepository, UserProductRepository userProductRepository, Logger log) {
        this.userRepositoryImpl = userRepositoryImpl;
        this.userContactRepository = userContactRepository;
        this.userProductRepository = userProductRepository;
        this.log = log;
    }

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        try {
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
                case "DELETE":
                    handleDelete(exchange);
                    break;
            }
        } catch (Exception e) {
            log.error(e.getMessage());
            String errorMessage = e.getMessage();
            byte[] message = errorMessage.getBytes(StandardCharsets.UTF_8);
            int statusCode = HttpURLConnection.HTTP_INTERNAL_ERROR;
            if (e instanceof NotFoundException) {
                statusCode = 404;
            }
            OutputStream responseBody = exchange.getResponseBody();
            exchange.sendResponseHeaders(statusCode, message.length);
            responseBody.write(message);
            responseBody.flush();
            responseBody.close();
        }
    }

    private void handleDelete(HttpExchange exchange) throws IOException {
        OutputStream responseBody = exchange.getResponseBody();
        int OK_STATUS = 200;
        String uri = exchange.getRequestURI().toString();
        System.out.println("URI: " + uri);
        if (uri.startsWith("/users")) {
            long id = resolveIdFromUri(uri, 2);
            log.info("started user deletion, id:" + id);
            userRepositoryImpl.delete(id);
            byte[] message = new byte[0];
            exchange.sendResponseHeaders(OK_STATUS, message.length);
            responseBody.write(message);
        }
        if (uri.startsWith("/contacts")) {
            long id = resolveIdFromUri(uri, 2);
            log.info("started contact deletion, id:" + id);
            userContactRepository.delete(id);
            byte[] message = new byte[0];
            exchange.sendResponseHeaders(OK_STATUS, message.length);
            responseBody.write(message);
        }
        if (uri.startsWith("/products")) {
            long id = resolveIdFromUri(uri, 2);
            log.info("started product deletion, id:" + id);
            userProductRepository.delete(id);
            byte[] message = new byte[0];
            exchange.sendResponseHeaders(OK_STATUS, message.length);
            responseBody.write(message);
        }

        responseBody.flush();
        responseBody.close();
    }

    private static long resolveIdFromUri(String uri, int index) {
        return Long.parseLong(uri.split("/")[index]);
    }

    private void handlePost(HttpExchange exchange) throws IOException {
        OutputStream responseBody = exchange.getResponseBody();

        int OK_STATUS = 200;
        String uri = exchange.getRequestURI().toString();

        if (exchange.getRequestURI().toString().equals("/users")) {
            byte[] bytes = exchange.getRequestBody().readAllBytes();
            UserEntity user = createGson().fromJson(new String(bytes), UserEntity.class);
            UserEntity savedUser = userRepositoryImpl.save(user);
            byte[] message = createMessage(savedUser);
            exchange.sendResponseHeaders(OK_STATUS, message.length);
            responseBody.write(message);
        }
        if (exchange.getRequestURI().toString().startsWith("/users")) {
            System.out.println("URI:" + uri);
            long productId = resolveIdFromUri(uri, 2);
            byte[] bytes = exchange.getRequestBody().readAllBytes();
            UserEntity user = createGson().fromJson(new String(bytes), UserEntity.class);
            ProductEntity productEntity = userProductRepository.fetchOne(productId);
            user.addLink(productEntity);
            UserEntity savedUser = userRepositoryImpl.save(user);
            UserDto userDto = mapEntityToDto(savedUser);
            byte[] message = createMessage(userDto);
            exchange.sendResponseHeaders(OK_STATUS, message.length);
            responseBody.write(message);
        }
        if (exchange.getRequestURI().toString().equals("/contacts")) {
            byte[] bytes = exchange.getRequestBody().readAllBytes();
            Contact contact = createGson().fromJson(new String(bytes), Contact.class);
            Contact savedContact = userContactRepository.save(contact);
            byte[] message = createMessage(savedContact);
            exchange.sendResponseHeaders(OK_STATUS, message.length);
            responseBody.write(message);
        }
        if (exchange.getRequestURI().toString().equals("/products")) {
            byte[] bytes = exchange.getRequestBody().readAllBytes();
            ProductEntity product = createGson().fromJson(new String(bytes), ProductEntity.class);
            ProductEntity savedProduct = userProductRepository.save(product);
            byte[] message = createMessage(savedProduct);
            exchange.sendResponseHeaders(OK_STATUS, message.length);
            responseBody.write(message);
        }
        responseBody.flush();
        responseBody.close();
    }

    private void handleGet(HttpExchange exchange) throws IOException, NotFoundException {

        OutputStream responseBody = exchange.getResponseBody();
        String ok = "OK";
        String testEndpoint = "TEST";
        String uri = exchange.getRequestURI().toString();
        int OK_STATUS = 200;

        if (exchange.getRequestURI().toString().equals("/status")) {
            exchange.sendResponseHeaders(OK_STATUS, ok.getBytes().length);
            responseBody.write(ok.getBytes(StandardCharsets.UTF_8));

        } else if (exchange.getRequestURI().toString().equals("/test")) {
            exchange.sendResponseHeaders(OK_STATUS, testEndpoint.getBytes().length);
            responseBody.write(testEndpoint.getBytes(StandardCharsets.UTF_8));

        } else if (exchange.getRequestURI().toString().equals("/users")) {
            byte[] message = createMessage(userRepositoryImpl.fetchAll());
            exchange.sendResponseHeaders(OK_STATUS, message.length);
            responseBody.write(message);
        } else if (exchange.getRequestURI().toString().startsWith("/users/one")) {
            long userId = resolveIdFromUri(uri, 3);
            UserEntity userEntity = userRepositoryImpl.fetchOne(userId);
            userEntity.initializeLinks(userProductRepository);
            UserDto user = mapEntityToDto(userEntity);
            byte[] message = createMessage(user);
            exchange.sendResponseHeaders(OK_STATUS, message.length);
            responseBody.write(message);
        } else if (exchange.getRequestURI().toString().equals("/contacts")) {
            byte[] message = createMessage(userContactRepository.findAll());
            exchange.sendResponseHeaders(OK_STATUS, message.length);
            responseBody.write(message);
        } else if (exchange.getRequestURI().toString().equals("/products")) {
            byte[] message = createMessage(userProductRepository.fetchAll());
            exchange.sendResponseHeaders(OK_STATUS, message.length);
            responseBody.write(message);

        } else {
            throw new NotFoundException("requested resource not found");
        }

        responseBody.flush();
        responseBody.close();

    }

    private UserDto mapEntityToDto(UserEntity source) {
        UserDto target = new UserDto();
        target.setId(source.getId());
        target.setName(source.getName());
        target.setEmail(source.getEmail());
        target.setPhoneNumber(source.getPhoneNumber());
        List<ProductEntity> userProducts = source.getUserProducts();
        if (Objects.nonNull(userProducts)) {
            target.setUserProducts(userProducts
                    .stream()
                    .map(this::mapEntityToDto)
                    .collect(Collectors.toList()));
        }
        return target;
    }

    private ProductDto mapEntityToDto(ProductEntity source) {
        ProductDto target = new ProductDto();
        target.setId(source.getId());
        target.setName(source.getName());
        target.setSeller(source.getSeller());
        return target;
    }

    private void handlePut(HttpExchange exchange) throws IOException {
        OutputStream responseBody = exchange.getResponseBody();

        int OK_STATUS = 200;

        if (exchange.getRequestURI().toString().equals("/users")) {
            byte[] bytes = exchange.getRequestBody().readAllBytes();
            UserEntity user = createGson().fromJson(new String(bytes), UserEntity.class);
            int updated = userRepositoryImpl.update(user);
            byte[] message = createMessage(user);
            exchange.sendResponseHeaders(OK_STATUS, message.length);
            responseBody.write(message);
        }
        if (exchange.getRequestURI().toString().equals("/contacts")) {
            byte[] bytes = exchange.getRequestBody().readAllBytes();
            Contact contact = createGson().fromJson(new String(bytes), Contact.class);
            Contact updated = userContactRepository.update(contact);
            byte[] message = createMessage(updated);
            exchange.sendResponseHeaders(OK_STATUS, message.length);
            responseBody.write(message);
        }
        if (exchange.getRequestURI().toString().equals("/products")) {
            byte[] bytes = exchange.getRequestBody().readAllBytes();
            ProductEntity product = createGson().fromJson(new String(bytes), ProductEntity.class);
            int updated = userProductRepository.update(product);
            byte[] message = createMessage(product);
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
