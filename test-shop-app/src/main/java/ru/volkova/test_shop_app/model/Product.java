package ru.volkova.test_shop_app.model;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    @Setter
    private String productName;
    @Column
    @Setter
    private Long price;

}
