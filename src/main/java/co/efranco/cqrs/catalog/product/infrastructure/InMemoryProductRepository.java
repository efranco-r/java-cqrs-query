package co.efranco.cqrs.catalog.product.infrastructure;

import co.efranco.cqrs.catalog.product.domain.Product;
import co.efranco.cqrs.catalog.product.domain.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Optional;

@Service
public final class InMemoryProductRepository implements ProductRepository {
    private final HashMap<String, Product> products = new HashMap<>();

    @Override
    public void save(final Product product) {
        this.products.put(product.getId(), product);
    }

    @Override
    public Optional<Product> search(final String id) {
        return Optional.ofNullable(products.get(id));
    }
}
