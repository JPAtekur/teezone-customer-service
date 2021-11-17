package com.teezone.customer.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Product {
    private Long productId;
    private String name;
    private String description;
    private Integer price;
}
