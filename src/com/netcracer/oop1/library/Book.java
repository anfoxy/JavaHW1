package com.netcracer.oop1.library;

import java.util.Arrays;

public class Book {
    private String name;
    private Authors[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Authors[] author, double price) {
        this.name = name;
        this.authors = author;
        this.price = price;
    }

    public Book(String name, Authors[] author, double price, int qty) {
        this.name = name;
        this.authors = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Authors[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorNames() {
        String result = "";
        for (Authors authors1 : authors) {
            result += authors1.getName() + "; ";

        }
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}

