package com.mycompany;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sehaj
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class ProductDB {

    Product product = null;
    HashMap<Integer, Product> productData =new HashMap<>();
    
    public ProductDB(){
        buildData();
    }

    public Product getProductFromUPC(int upc){
        return productData.get(upc);
    }
    public void buildData() {
        try {
            File productDatabase = new File("src/ProductDatabase.txt");
            Scanner myReader = new Scanner(productDatabase);
            while (myReader.hasNextLine()) {
                String[] product = myReader.nextLine().split(",");
// Get the UPC code, name and price from the database
                int UPC = Integer.parseInt(product[0]);
                String name = product[1];
                double price = Double.parseDouble(product[2]);
                productData.put(UPC, new Product(UPC, name, price));
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
