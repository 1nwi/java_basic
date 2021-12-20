package com.kh.example.practice2.model.vo;

public class Product {

    public String pName;
    public int price;
    public String brand;

    public Product(String name, int pPrice, String pBrand) {
        pName = name;
        price = pPrice;
        brand = pBrand;
    }

    public void information() {
        System.out.println(pName);
        System.out.println(price);
        System.out.println(brand);
    }

}
