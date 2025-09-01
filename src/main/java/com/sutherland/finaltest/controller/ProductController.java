package com.sutherland.finaltest.controller;

import com.sutherland.finaltest.model.Product;
import com.sutherland.finaltest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

        @Autowired
    private ProductService productService;

       //frst end point to the getll products
          @GetMapping("/getAllProducts")
                public List<Product> getAllProducts() {
        return productService.getAllProducts();
           }

        // end pt to price
    @GetMapping("/getByTypeAndPrice")
             public List<Product> getByTypeAndPrice(@RequestParam String type, @RequestParam double price) {
        return productService.getByTypeAndPrice(type, price);
        }
}
