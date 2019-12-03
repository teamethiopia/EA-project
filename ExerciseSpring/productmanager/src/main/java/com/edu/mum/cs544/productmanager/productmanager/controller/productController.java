package com.edu.mum.cs544.productmanager.productmanager.controller;

import com.edu.mum.cs544.productmanager.productmanager.model.Product;
import com.edu.mum.cs544.productmanager.productmanager.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class productController {
    @Autowired
    public ProductService productService;
    @RequestMapping("/")
    public String ViewHomePage(Model model){
        List<Product> productList =productService.findAll();
        model.addAttribute("productList",productList);
        return "Index";

    }
@RequestMapping("/new")
    public String productForm(Model model){
        Product product= new Product();
        model.addAttribute("products",product);
        return "newProduct";
    }
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute("product")Product product){
    productService.save(product);
       return "redirect:/";

    }
}
