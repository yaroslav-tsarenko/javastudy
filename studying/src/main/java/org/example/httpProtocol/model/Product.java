package org.example.httpProtocol.model;

import java.util.Objects;

public class Product {
    private String name;
    private String seller;
    private Long id;

    public Product(String name, String seller, Long id) {
        this.name = name;
        this.seller = seller;
        this.id = id;
    }
    public Product(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(seller, product.seller) && Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, seller, id);
    }
}
