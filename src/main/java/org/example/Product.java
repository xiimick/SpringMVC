package org.example;

public class Product {
    private int id;
    private String name;
    private double cost;

    // Конструктор
    public Product(int id, String name, double cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    // Геттери
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }
}