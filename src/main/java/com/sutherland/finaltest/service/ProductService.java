package com.sutherland.finaltest.service;

import com.sutherland.finaltest.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    // Sample list of products
    private List<Product> products = Arrays.asList(
            new Product(101, "RedTape", "Shoes", 1500),
            new Product(102, "AllenSolley", "Shirts", 1000),
            new Product(103, "WoodLand", "Shoes", 2500),
            new Product(104, "Oxemberg", "Shirts", 900),
            new Product(105, "Arrow", "Shirts", 1100),
            new Product(106, "Bata", "Shoes", 899),
            new Product(107, "Raymond", "Blazers", 3000),
            new Product(108, "ParkAvenue", "Blazers", 2500),
            new Product(109, "PeterEngland", "Shirts", 1200),
            new Product(110, "LondonBridge", "Shirts", 700)
    );

    // Get all products
    public List<Product> getAllProducts() {
        return products;
    }

    // Get products filtered by type and price
    public List<Product> getByTypeAndPrice(String type, double price) {
        return products.stream()
                .filter(product -> product.getProductType().equalsIgnoreCase(type) && product.getPrice() > price)
                .collect(Collectors.toList());
    }
}
