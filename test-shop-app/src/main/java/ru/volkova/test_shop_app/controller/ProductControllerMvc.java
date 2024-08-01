package ru.volkova.test_shop_app.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.volkova.test_shop_app.service.ProductService;

@Controller
@RequiredArgsConstructor
public class ProductControllerMvc {
    private final ProductService productService;

    @GetMapping("/products")
    String getProductsView(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "products";
    }
}
