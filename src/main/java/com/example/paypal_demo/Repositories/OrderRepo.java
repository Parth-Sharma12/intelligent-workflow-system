package com.example.paypal_demo.Repositories;

import com.example.paypal_demo.Models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


public interface OrderRepo{
    Integer create_order(Order order);
    Order get_order_by_id(Integer ID);
    List<Order> get_all_order();
}