package org.example;

import java.util.Date;
import java.util.List;

public class Order {
    private int id;
    private Date creationDate;
    private double totalCost;
    private List<Product> products;

    // Конструктор
    public Order(int id, Date creationDate, double totalCost, List<Product> products) {
        this.id = id;
        this.creationDate = creationDate;
        this.totalCost = totalCost;
        this.products = products;
    }

    // Геттери
    public int getId() {
        return id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public List<Product> getProducts() {
        return products;
    }
}
