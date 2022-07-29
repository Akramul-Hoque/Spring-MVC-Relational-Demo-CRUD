package com.example.DTO;

public class ProductDTO {
    private String productName;
    private String productType;
    private int productPrice;
    private int companyId;

    public ProductDTO() {
    }

    public ProductDTO(String productName, String productType, int productPrice, int companyId) {
        this.productName = productName;
        this.productType = productType;
        this.productPrice = productPrice;
        this.companyId = companyId;
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

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }
}
