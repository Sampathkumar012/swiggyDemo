package com.neoteric.Swiggy.Model;

public class Menu {

    public String dishName;
    public String type;
    public double price;


    @Override
    public String toString() {
        return "Menu{" +
                "dishName='" + dishName + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }

    public Menu(String dishName, String type, double price) {
        this.dishName = dishName;
        this.type = type;
        this.price = price;

    }
}
