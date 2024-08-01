package ru.volkova.test_shop_app.service;

import ru.volkova.test_shop_app.dto.ProductCreateDto;
import ru.volkova.test_shop_app.dto.ProductDto;
import ru.volkova.test_shop_app.dto.ProductUpdateDto;

import java.util.List;

public interface ProductService {
    ProductDto getProductById(Long id);
    List<ProductDto> getAllProducts();
    ProductDto createProduct(ProductCreateDto productCreateDto);

    ProductDto updateProduct(ProductUpdateDto productUpdateDto);

    void deleteProduct(Long id);
}
