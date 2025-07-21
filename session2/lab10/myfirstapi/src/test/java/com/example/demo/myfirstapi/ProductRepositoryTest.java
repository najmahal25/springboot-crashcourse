package com.example.demo.myfirstapi;

import com.example.demo.myfirstapi.model.Product;
import com.example.demo.myfirstapi.repository.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;


public class ProductRepositoryTest {
    ProductRepository productRepository = new ProductRepository();

    @Test
    public void findAllProducts(){
        List<Product> products = productRepository.findAll();


        assertEquals(3, products.size(), "Should return 3 initial products");


        assertEquals("Laptop", products.get(0).getName());
        assertEquals("Mouse", products.get(1).getName());
        assertEquals("Keyboard", products.get(2).getName());


        products.forEach(product -> assertNotNull(product.getId()));
    }

    @Test
    public void testFindById(){
        List<Product> products = productRepository.findAll();

        Optional<Product> result = productRepository.findById(1L);

        assertTrue(result.isPresent());
        assertEquals(products.get(0), result.get());

    }

    @Test
    public void testSaveProduct(){
        productRepository.save(new Product("Test1",25));
        
        List<Product> products = productRepository.findAll();
        Optional<Product> result = productRepository.findById(4L);
        assertTrue(result.isPresent());
        assertEquals(products.get(3), result.get());


    }



}
