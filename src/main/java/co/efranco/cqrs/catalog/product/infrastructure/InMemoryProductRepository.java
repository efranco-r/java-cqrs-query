package co.efranco.cqrs.catalog.product.infrastructure;

import co.efranco.cqrs.catalog.product.domain.Product;
import co.efranco.cqrs.catalog.product.domain.ProductRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Optional;

@Repository
public final class InMemoryProductRepository implements ProductRepository {
    private final HashMap<String, Product> products = new HashMap<>();

    @Override
    public void save(final Product product) {
        this.products.put(product.id(), product);
    }

    @Override
    public Optional<Product> search(final String id) {
        return Optional.ofNullable(products.get(id));
    }
}
