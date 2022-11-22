package com.skypro.product.MODEL;

public class Product {
    String name;
    int id;
    int counter;
    int price;
    public Product(String name,int price) {
        this.name = name;
        this.price=price;
        id = counter++;

    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", id=" + id +
                ", counter=" + counter +
                '}';
    }
}
