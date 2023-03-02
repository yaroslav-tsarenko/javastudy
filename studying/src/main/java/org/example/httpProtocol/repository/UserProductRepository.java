package org.example.httpProtocol.repository;

import org.example.httpProtocol.datasource.Datasource;
import org.example.httpProtocol.model.Product;
import org.example.httpProtocol.model.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class UserProductRepository {
    private final Set<Product> products = new HashSet<>();
    private final Datasource datasource;

    public UserProductRepository(Datasource datasource) {
        this.datasource = datasource;
    }

    public Product save(Product product) {
        datasource.execute("INSERT INTO app_product (name, seller, id) " +
                "VALUES ('" + product.getName() + "', '" + product.getSeller() + "', '" + product.getId() + "');");
        return product;
    }

    public Product update(Product product) {

        datasource.execute("UPDATE app_product SET name = '" + product.getName() + "', " + "seller = '" + product.getSeller()
                + "', " + "' WHERE id = " + product.getId() + ";");

        return product;
    }

    public void delete(Long id) {

        datasource.execute("DELETE FROM app_product WHERE id = " + id + ";");

    }


    public Set<Product> findAll() {
        Set<Product> products = new HashSet<>();
        try (ResultSet resultSet = datasource.fetchAll("app_product")) {
            while (resultSet.next()) {
                Product product = new Product();
                Object id = resultSet.getObject("id");
                Object name = resultSet.getObject("name");
                Object seller = resultSet.getObject("seller");
                product.setId((Long) id);
                product.setName((String) name);
                product.setSeller((String) seller);
                products.add(product);
            }
            datasource.closeConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return products;
    }
}
