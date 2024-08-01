package ru.volkova.test_shop_app.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.volkova.test_shop_app.dto.ProductCreateDto;
import ru.volkova.test_shop_app.dto.ProductDto;
import ru.volkova.test_shop_app.dto.ProductUpdateDto;
import ru.volkova.test_shop_app.model.Product;
import ru.volkova.test_shop_app.repository.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{
    private final ProductRepository productRepository;

    @Override
    public ProductDto getProductById(Long id){
        Product product = productRepository.findById(id).orElseThrow();
        return convertToDto(product);
    }

    @Override
    public List<ProductDto> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return products.stream().map(this::convertToDto).collect(Collectors.toList());
    }

    @Override
    public ProductDto createProduct(ProductCreateDto productCreateDto){
        Product product = productRepository.save(convertToEntity(productCreateDto));
        ProductDto productDto = convertToDto(product);
        return productDto;
    }

    @Override
    public ProductDto updateProduct(ProductUpdateDto productUpdateDto) {
        Product product = productRepository.findById(productUpdateDto.getId()).orElseThrow();
        product.setProductName(productUpdateDto.getProductName());
        product.setPrice(productUpdateDto.getPrice());
        Product savedProduct = productRepository.save(product);
        ProductDto productDto = convertToDto(savedProduct);
        return productDto;
    }

    @Override
    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }

    private Product convertToEntity(ProductCreateDto productCreateDto) {
        return Product.builder()
                .productName(productCreateDto.getProductName())
                .price(productCreateDto.getPrice())
                .build();
    }

    private ProductDto convertToDto(Product product) {
        return ProductDto.builder()
                .id(product.getId())
                .productName(product.getProductName())
                .price(product.getPrice())
                .build();
    }

}
