package com.example.demo.myfirstapi;

import com.example.demo.myfirstapi.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {
    Product productWithID;

    @BeforeEach
    public void setup(){
        productWithID = new Product(1L,"test2", 50);
    }

    @Test
    public void getProductID(){
        assertEquals(1L, productWithID.getId());
    }

    @Test
    public void getNameOfProduct(){
        assertEquals("test2", productWithID.getName());
    }

    @Test
    public void getPriceOfProduct(){
        assertEquals(50, productWithID.getPrice());
    }

    @Test
    public void changeIDProduct(){
        productWithID.setId(2L);
        assertEquals(2L, productWithID.getId());
    }

    @Test
    public void changeProductName(){
        productWithID.setName("newname");
        assertEquals("newname", productWithID.getName());
    }

    @Test
    public void changeProductPrice(){
        productWithID.setPrice(25);
        assertEquals(25, productWithID.getPrice());
    }





}
