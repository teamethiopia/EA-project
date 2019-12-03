package com.edu.mum.cs544.productmanager.productmanager.service;

import com.edu.mum.cs544.productmanager.productmanager.model.Product;
import com.edu.mum.cs544.productmanager.productmanager.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void save(Product product) {
    productRepository.save(product);
    }

    @Override
    public Product getProduct(Long id) {
        return productRepository.findById(id).get();
    }

    @Override
    public void deleteById(Long id) {
       productRepository.deleteById(id);
    }
}
