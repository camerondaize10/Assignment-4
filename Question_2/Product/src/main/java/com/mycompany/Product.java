package com.mycompany;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sehaj
 */
public class Product {

    private int UPCCode;
    private String name;
    private double price;

    public Product(int UPCCode, String name, double price) {
        this.UPCCode = UPCCode;
        this.name = name;
        this.price = price;
    }

    public void setUPCCode(int UPCCode) {
        this.UPCCode = UPCCode;
    }

    public int getUPCCode() {
        return UPCCode;
    }
    
    public double getPrice(){
        return price;
    }
    
    public String getName(){
        return name;
    }
    
    

    @Override
    public String toString() {
        return "Product{"
                + "UPCCode=" + UPCCode
                + ", name='" + name + '\''
                + ", price=" + price
                + '}';
    }
}
