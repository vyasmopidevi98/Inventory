package com.inventory.Entity;

import jakarta.persistence.*;

@Entity
public class Inventory {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="product_id")
    private Integer productId;
    @Column(name="product_name",unique=true)
    private String productName;
    @Column(name="product_code",nullable=false)
    private String productCode;
    @Column(name="product_price",nullable=false)
    private Double productPrice;
    @Column(name="product_stock")
    private Integer productStock;
    @Column(name="product_category")
    private String productCategory;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getProductStock() {
        return productStock;
    }

    public void setProductStock(Integer productStock) {
        this.productStock = productStock;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public Inventory() {
    }

    public Inventory(Integer productId, String productName, String productCode, Double productPrice, Integer productStock, String productCategory) {
        this.productId = productId;
        this.productName = productName;
        this.productCode = productCode;
        this.productPrice = productPrice;
        this.productStock = productStock;
        this.productCategory = productCategory;
    }
}
