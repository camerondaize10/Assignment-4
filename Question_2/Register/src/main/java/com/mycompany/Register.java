/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author Sehaj
 */
public class Register {

    private ProductDB productDB = new ProductDB();

    public Product getProductFromUPC(int UPCCode) {
        Product product = productDB.getProductFromUPC(UPCCode);
        return product;   
    }

}

