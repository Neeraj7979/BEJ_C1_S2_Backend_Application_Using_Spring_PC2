package com.niit.bej.domain;

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
}
