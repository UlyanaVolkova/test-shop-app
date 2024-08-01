package ru.volkova.test_shop_app.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ProductUpdateDto {
    private Long id;
    private String productName;
    private Long price;
}
