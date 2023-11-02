package com.exercicio.alison.dto;

import com.exercicio.alison.entity.Product;
import lombok.AllArgsConstructor;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
@Setter
public class ProductDto {

    private Integer id;
    private String name;
    private String description;
    private Double value;

    public ProductDto(Product entity) {
        id = entity.getId();
        name = entity.getName();
        description = entity.getDescription();
        value = entity.getValue();
    }

}
