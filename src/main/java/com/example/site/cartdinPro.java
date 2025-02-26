package com.example.site;

public class cartdinPro {
    String price;
    int ID;
    String name, description,Quantity;
    public cartdinPro(String name,String price, String description, int ID,String Quantity) {
        this.price = price;
        this.ID=ID;
        this.name = name;
        this.description = description;
    this.Quantity=Quantity;}
    public String getQuantity(){return Quantity;
    }
    public int getID(){return ID;}
    public String getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }




}
