package com.example.paypal_demo.Services;

import com.example.paypal_demo.Models.Order;
import com.example.paypal_demo.Repositories.HardCodedOrderRepo;
import com.example.paypal_demo.Repositories.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private HardCodedOrderRepo repo;

    public Integer create_order(Order order){
        return repo.create_order(order);
    }
    public List<Order> get_all_order(){
        return repo.get_all_order();
    }
    public Order get_order_by_id(Integer id){
        return repo.get_order_by_id(id);
    }
}
