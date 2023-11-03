package com.exercicio.alison.config;

import com.exercicio.alison.entity.Product;
import com.exercicio.alison.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("dev")
public class TestConfig implements CommandLineRunner {

    @Autowired
    ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {

        Product product = new Product(null, "PS5", "Console sony playstation 5 digital" +
                "spider-man 2 limited edition", 4799.);
        Product product2 = new Product(null, "Xbox Seris S", "Console Xbox Seris S branco", 2199.);
        Product product3 = new Product(null, "Nitendo Switch", "Console nitendo switch OLED branco",
                2899.);

        productRepository.saveAll(Arrays.asList(product, product2, product3));

    }
}
