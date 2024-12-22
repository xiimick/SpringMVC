package org.example;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderRepository orderRepository = new OrderRepository();

    // Отримання конкретного замовлення
    @GetMapping("/{id}")
    public Order getOrder(@PathVariable int id) {
        return orderRepository.getOrderById(id)
                .orElseThrow(() -> new RuntimeException("Order not found"));
    }

    // Отримання всіх замовлень
    @GetMapping
    public List<Order> getAllOrders() {
        return orderRepository.getAllOrders();
    }

    // Додавання нового замовлення
    @PostMapping
    public void addOrder(@RequestBody Order order) {
        orderRepository.addOrder(order);
    }
}
