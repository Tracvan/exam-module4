package com.codegym.exammodule4.controller;

import com.codegym.exammodule4.model.Product;
import com.codegym.exammodule4.service.ProductService;
import com.codegym.exammodule4.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping ("/")
public class ProductController {
    @Autowired
    ProductServiceImpl productService;
    @GetMapping("/")
public String showAllProduct(Model model){
    List<Product> productList = productService.showAllProduct();
     model.addAttribute("productList", productList);
     return "/home";
}
@GetMapping("/add")
public String addProduct(Model model){
        List<String> typeList = productService.getProductType();
        model.addAttribute("typeList", typeList);
        return "/add";
    }
}
