package ru.volkova.test_shop_app.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.volkova.test_shop_app.dto.ProductCreateDto;
import ru.volkova.test_shop_app.dto.ProductDto;
import ru.volkova.test_shop_app.dto.ProductUpdateDto;
import ru.volkova.test_shop_app.service.ProductService;
@RequiredArgsConstructor
@RestController
public class ProductController {
    private final ProductService productService;

    @GetMapping("/product/{id}")
    ProductDto getProductById(@PathVariable("id") Long id) {
        return productService.getProductById(id);
    }

    @PostMapping("/product/create")
    ProductDto createProduct(@RequestBody ProductCreateDto productCreateDto) {
        return productService.createProduct(productCreateDto);
    }

    @PostMapping("/product/update")
    ProductDto updateProduct(@RequestBody ProductUpdateDto productUpdateDto) {
        return productService.updateProduct(productUpdateDto);
    }

    @DeleteMapping("/product/delete/{id}")
    void deleteProduct(@PathVariable("id") Long id) {
        productService.deleteProduct(id);
    }
}
