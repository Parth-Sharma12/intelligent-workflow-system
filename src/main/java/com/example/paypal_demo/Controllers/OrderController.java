package com.example.paypal_demo.Controllers;

import com.example.paypal_demo.Models.Order;
import com.example.paypal_demo.Services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class OrderController {
    @Autowired
    private OrderService service;

    @PostMapping("/add-order")
    public Integer create_order(@RequestBody Order order){
        return service.create_order(order);
    }

    @GetMapping("get_order/{id}")
    public Order get_order_by_id(@PathVariable int id){
        return service.get_order_by_id(id);
    }

    @GetMapping("get_all_order")
    public List<Order> get_all_order(){
        return service.get_all_order();
    }

}
