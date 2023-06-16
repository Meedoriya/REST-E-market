package com.alibi.springboot.productmanager.dto;

import lombok.Data;

@Data
public class ProductDTO {

    private String name;
    private Short amount;
    private Long categoryId;
}
