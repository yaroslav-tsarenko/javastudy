package org.example.httpProtocol.config;

import org.example.httpProtocol.entity.ProductEntity;
import org.example.httpProtocol.entity.UserEntity;
import org.example.httpProtocol.repository.UserProductRepository;
import org.example.httpProtocol.repository.UserRepository;

import java.sql.Connection;

public class Configuration {
    public static UserRepository getUserRepository() {
        String dbUrl = "jdbc:postgresql://localhost:5432/";
        String username = "postgres";
        String password = "Profimaster2019201920182018";
        String dbName = "demo_server_db?currentSchema=demo_server_local";
        return UserRepository.builder(UserEntity.class, UserRepository.class)
                .baseUrl(dbUrl)
                .dbName(dbName)
                .dbUsername(username)
                .dbPassword(password)
                .dbIsolationLevel(Connection.TRANSACTION_REPEATABLE_READ)
                .maxParallelConnections(10)
                .logQuery(false)
                .printQuery(true)
                .build();
    }

    public static UserProductRepository getUserProductRepository() {
        String dbUrl = "jdbc:postgresql://localhost:5432/";
        String username = "postgres";
        String password = "Profimaster2019201920182018";
        String dbName = "demo_server_db?currentSchema=demo_server_local";
        return UserProductRepository.builder(ProductEntity.class, UserProductRepository.class)
                .baseUrl(dbUrl)
                .dbName(dbName)
                .dbUsername(username)
                .dbPassword(password)
                .dbIsolationLevel(Connection.TRANSACTION_REPEATABLE_READ)
                .maxParallelConnections(10)
                .logQuery(false)
                .printQuery(false)
                .build();
    }
}
