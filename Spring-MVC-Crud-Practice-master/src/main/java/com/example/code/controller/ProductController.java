package com.example.code.controller;

import com.example.DTO.ProductDTO;
import com.example.code.model.Company;
import com.example.code.model.Product;
import com.example.code.service.CompanyService;
import com.example.code.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.Console;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ProductController {
    private final ProductService productService;
    private final CompanyService companyService;

    public ProductController(ProductService productService, CompanyService companyService){
        this.productService = productService;
        this.companyService = companyService;
    }

    @PostMapping("product-create")
    public String addProduct(ProductDTO product){
        Company company = companyService.getCompanyById(product.getCompanyId());
        this.productService.addProduct(product, company);
        return "redirect:/product";
    }

    @GetMapping("product")
    public ModelAndView getProducts(){
        List<Product> products = this.productService.getProducts();
        ModelAndView mav = new ModelAndView("product");
        mav.addObject("products", products);

        return mav;
    }

    @GetMapping("product-add")
    public ModelAndView addProduct(){
        ModelAndView mav = new ModelAndView("create-product");
        List<Company> companies = companyService.getCompanies();
        mav.addObject("companies", companies);

        return mav;
    }

    @GetMapping("product-edit/{id}")
    public ModelAndView editProduct(@PathVariable int id){
        Product product = this.productService.getProductById(id);
        List<Company> companies = this.companyService.getCompanies();
        ModelAndView mav = new ModelAndView("update-product");
        Map<String, Object> map = new HashMap<>();
        map.put("product", product);
        map.put("companies", companies);

        mav.addAllObjects(map);

        return mav;
    }

    @PostMapping("product-update")
    public String updateProduct(Product product, int companyId){
        Company company = this.companyService.getCompanyById(companyId);
        product.setCompany(company);
        this.productService.updateProduct(product);
        return "redirect:/product";
    }

    @GetMapping("product-delete/{id}")
    public String deleteProduct(@PathVariable int id){
        this.productService.deleteProduct(id);
        return "redirect:/product";
    }
}
