package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OrderRepository {
    private List<Order> orders = new ArrayList<>();

    // Отримання замовлення по ID
    public Optional<Order> getOrderById(int id) {
        return orders.stream().filter(order -> order.getId() == id).findFirst();
    }

    // Отримання всіх замовлень
    public List<Order> getAllOrders() {
        return orders;
    }

    // Додавання нового замовлення
    public void addOrder(Order order) {
        orders.add(order);
    }
}
