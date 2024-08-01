package ru.volkova.test_shop_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.volkova.test_shop_app.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
