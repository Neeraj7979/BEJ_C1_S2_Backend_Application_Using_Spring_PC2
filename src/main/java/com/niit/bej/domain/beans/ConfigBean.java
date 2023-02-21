package com.niit.bej.domain.beans;

import com.niit.bej.domain.Product;
import org.springframework.context.annotation.Bean;

public class ConfigBean {
    @Bean
    public Product getProductDetails() {
        return new Product("Samsung-Galaxy", 101, 100, 12200);
    }
}
