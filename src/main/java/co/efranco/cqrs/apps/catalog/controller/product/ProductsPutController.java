package co.efranco.cqrs.apps.catalog.controller.product;

import co.efranco.cqrs.catalog.product.application.create.CreateProductRequest;
import co.efranco.cqrs.catalog.product.application.create.ProductCreator;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v.1.0")
public final class ProductsPutController {
    private final ProductCreator creator;

    public ProductsPutController(ProductCreator creator) { this.creator = creator; }

    @PutMapping("/products/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@PathVariable String id, @RequestBody Request request) {
        System.out.println(request.toString());
        creator.create(new CreateProductRequest(id, request.getName(), request.getPrice()));
    }
}

final class Request {
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Request{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
