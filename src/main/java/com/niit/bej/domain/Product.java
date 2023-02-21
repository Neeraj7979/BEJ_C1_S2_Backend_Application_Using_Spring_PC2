package com.niit.bej.domain;

import java.util.Objects;

public class Product {
    private String productName;
    private int productId;
    private int productQuantity;
    private double productPrice;

    public Product(String productName, int productId, int productQuantity, double productPrice) {
        this.productName = productName;
        this.productId = productId;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
    }

    public Product() {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productId == product.productId && productQuantity == product.productQuantity && Double.compare(product.productPrice, productPrice) == 0 && Objects.equals(productName, product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, productId, productQuantity, productPrice);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productId=" + productId +
                ", productQuantity=" + productQuantity +
                ", productPrice=" + productPrice +
                '}';
    }
}
