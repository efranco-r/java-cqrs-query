package co.efranco.cqrs.catalog.product.domain;

public final class Product {
    private final String id;
    private final String name;
    private final double price;

    public Product(final String id, final String name, final double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String id() {
        return id;
    }

    public String name() {
        return name;
    }

    public double price() {
        return price;
    }
}
