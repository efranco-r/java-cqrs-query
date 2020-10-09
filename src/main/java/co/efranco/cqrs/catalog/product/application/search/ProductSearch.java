package co.efranco.cqrs.catalog.product.application.search;

import co.efranco.cqrs.catalog.product.domain.Product;
import co.efranco.cqrs.catalog.product.domain.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public final class ProductSearch implements ProductSearchService {
    private final ProductRepository repository;

    public ProductSearch(ProductRepository repository) { this.repository = repository; }

    @Override
    public Optional<Product> search(final String id) {
            return this.repository.search(id);
    }
}
