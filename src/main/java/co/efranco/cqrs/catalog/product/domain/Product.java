package co.efranco.cqrs.catalog.product.domain;

import java.io.Serializable;

public final class Product implements Serializable {
    private final String id;
    private final String name;
    private final double price;

    public Product(final String id, final String name, final double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
