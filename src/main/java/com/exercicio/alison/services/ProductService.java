package com.exercicio.alison.services;

import com.exercicio.alison.dto.ProductDto;
import com.exercicio.alison.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public ProductDto findById(int id) {
        return productRepository.findById(id).stream()
                .map(ProductDto::new)
                .findAny()
                .orElse(null);
    }

    public List<ProductDto> findAll() {
        return productRepository.findAll().stream()
                .map(ProductDto::new)
                .toList();
    }

}
