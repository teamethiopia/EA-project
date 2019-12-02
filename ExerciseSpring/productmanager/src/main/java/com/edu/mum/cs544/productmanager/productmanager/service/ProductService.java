package com.edu.mum.cs544.productmanager.productmanager.service;

import com.edu.mum.cs544.productmanager.productmanager.model.Product;

import java.util.List;

public interface ProductService {
List<Product> findAll();
void save(Product product);
Product getProduct(Long id);
void deleteById(Long id);


}
