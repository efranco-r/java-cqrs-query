package co.efranco.cqrs.catalog.product.application.create;

import co.efranco.cqrs.catalog.product.domain.Product;
import co.efranco.cqrs.catalog.product.domain.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public final class ProductCreator {
    private final ProductRepository repository;

    public ProductCreator(ProductRepository repository) {
        this.repository = repository;
    }

    public void create(final CreateProductRequest request) {
        final Product product = new Product(request.id(), request.name(), request.price());
        repository.save(product);
    }
}
