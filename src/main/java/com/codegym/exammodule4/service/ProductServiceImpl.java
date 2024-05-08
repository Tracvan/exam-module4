package com.codegym.exammodule4.service;

import com.codegym.exammodule4.model.Product;
import com.codegym.exammodule4.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
@Autowired
    ProductRepository productRepository;
public List<Product> showAllProduct(){
    return productRepository.findAll();
}
public void addProduct(Product product){
    productRepository.save(product);
}
public List<String> getProductType(){
   List<String> typeList =  productRepository.findAllTypes();
   return typeList;
}
}
