package ru.volkova.test_shop_app.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ProductCreateDto {
    private String productName;
    private Long price;
}
