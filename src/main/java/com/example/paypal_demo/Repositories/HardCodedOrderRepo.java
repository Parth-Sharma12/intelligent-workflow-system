package com.example.paypal_demo.Repositories;

import com.example.paypal_demo.Models.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class HardCodedOrderRepo implements OrderRepo{
    private final List<Order> orders = new ArrayList<Order>();
    private int nextId = 1;

    // optional: initialize with dummy data
    public HardCodedOrderRepo() {
        orders.add(new Order(1, "John Doe", "john.doe@example.com", "Acme Corp", "sales@acmecorp.com",
                2500.75f, "Enterprise software license", "PENDING"));

        orders.add(new Order(2, "Alice Johnson", "alice.j@example.com", "TechNova", "billing@technova.io",
                1250.50f, "Cloud hosting services", "PAID"));

        orders.add(new Order(3, "Bob Williams", "bob.w@example.com", "Designify", "invoices@designify.com",
                890.00f, "UI/UX design services", "PENDING"));

        orders.add(new Order(4, "Sarah Lee", "sarah.lee@example.com", "ByteWorks", "accounts@byteworks.co",
                3200.00f, "Custom web app development", "CANCELLED"));}

    @Override
    public Integer create_order(Order order) {
        order.setOrder_id(nextId++);
        orders.add(order);
        return order.getOrder_id();
    }

    @Override
    public Order get_order_by_id(Integer id) {
        return orders.stream()
                .filter(o -> o.getOrder_id() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Order> get_all_order(){ return orders; }
}