package com.example.code.service;

import com.example.DTO.ProductDTO;
import com.example.code.model.Company;
import com.example.code.model.Product;
import com.example.code.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public Product addProduct(ProductDTO product, Company company){
        Product product1 = new Product();
        product1.setProductName(product.getProductName());
        product1.setProductType(product.getProductType());
        product1.setProductPrice(product.getProductPrice());
        product1.setCompany(company);
        return this.productRepository.save(product1);
    }
    public List<Product> getProducts(){
        return (List<Product>) this.productRepository.findAll();
    }
    public Product getProductById(int id){
        return this.productRepository.findById(id).get();
    }
    public void updateProduct(Product product){
        this.productRepository.save(product);
    }
    public void deleteProduct(int id){
        this.productRepository.deleteById(id);
    }

}
