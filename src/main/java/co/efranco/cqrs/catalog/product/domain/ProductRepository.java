package co.efranco.cqrs.catalog.product.domain;

import java.util.Optional;

public interface ProductRepository {
    void save(final Product product);

    Optional<Product> search(final String id);
}
