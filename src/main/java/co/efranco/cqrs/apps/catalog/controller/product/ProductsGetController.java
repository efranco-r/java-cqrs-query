package co.efranco.cqrs.apps.catalog.controller.product;

import co.efranco.cqrs.catalog.product.application.search.ProductSearch;
import co.efranco.cqrs.catalog.product.domain.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/v.1.0")
public final class ProductsGetController {
    private final ProductSearch search;

    public ProductsGetController(ProductSearch search) { this.search = search; }

    @GetMapping("/products/{id}")
    public Optional<Product> search(@PathVariable String id) {
        return this.search.search(id);
    }
}
