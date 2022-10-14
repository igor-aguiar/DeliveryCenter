package com.example.DeliveryCenter.dto;

import com.example.DeliveryCenter.model.Product;

public class ProductDTO {
    private String productName;
    private String productPrice;
    private String productDescription;

    public ProductDTO() {
    }

    public ProductDTO(String productName, String productPrice, String productDescription) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productDescription = productDescription;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Product toProduct(){
        return new Product(Double.parseDouble(this.productPrice), this.productName, this.productDescription);
    }
}
