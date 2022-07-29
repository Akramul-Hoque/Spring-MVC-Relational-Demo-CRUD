package com.example.code.model;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String productName;
    private String productType;
    private int productPrice;

    @ManyToOne(targetEntity = Company.class, cascade = CascadeType.REFRESH)
    @JoinColumn(name = "company_id", referencedColumnName = "id")
    private Company company;

    public Product(){}

    public Product(String productName, String productType, int productPrice, Company company) {
        this.productName = productName;
        this.productType = productType;
        this.productPrice = productPrice;
        this.company = company;
    }

    public Product(int id, String productName, String productType, int productPrice, Company company) {
        this.id = id;
        this.productName = productName;
        this.productType = productType;
        this.productPrice = productPrice;
        this.company = company;
    }

    public Product(int id, String productName, String productType, int productPrice) {
        this.id = id;
        this.productName = productName;
        this.productType = productType;
        this.productPrice = productPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
