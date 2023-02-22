package org.example.httpProtocol.repository;

import org.example.httpProtocol.model.Product;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class UserProductRepository {
    private final Set<Product> products = new HashSet<>();

    public Product save(Product product) {
        long id = generateId();
        product.setId(id);
        products.add(product);
        return product;
    }

    public Product update(Product product) {
        Optional<Product> checkedProduct = products.stream()
                .filter(currentContact -> currentContact.getId().equals(product.getId())).findFirst();
        if (checkedProduct.isPresent()) {
            products.remove(checkedProduct.get());
            products.add(product);
            return product;
        } else {
            return save(product);
        }
    }

    public void delete(Long id) {
        Optional<Product> checkedProduct = products.stream()
                .filter(currentContact -> currentContact.getId().equals(id)).findFirst();
        if (checkedProduct.isPresent()) {
            products.remove(checkedProduct.get());
        }
    }

    private long generateId() {
        long id = 1;
        Optional<Product> max = products.stream().max(Comparator.comparing(Product::getId));
        if (max.isPresent()) {
            id = max.get().getId() + 1;
        }
        return id;
    }

    public Set<Product> findAll() {
        return products;
    }
}
