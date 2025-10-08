package com.example.paypal_demo.Models;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import org.springframework.stereotype.Component;
import jakarta.persistence.Table;

import jakarta.persistence.Entity;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int order_id;
    private String buyer_name;
    private String buyer_email;
    private String seller_name;
    private String seller_email;
    private Float amount;
    private String description;
    private String status;



    public String getBuyer_email() {
        return buyer_email;
    }

    public Order(int order_id, String buyer_name, String buyer_email, String seller_name, String seller_email, Float amount, String description, String status) {
        this.order_id = order_id;
        this.buyer_name = buyer_name;
        this.buyer_email = buyer_email;
        this.seller_name = seller_name;
        this.seller_email = seller_email;
        this.amount = amount;
        this.description = description;
        this.status = status;
    }

    public void setBuyer_email(String buyer_email) {
        this.buyer_email = buyer_email;
    }

    public String getSeller_email() {
        return seller_email;
    }

    public void setSeller_email(String seller_email) {
        this.seller_email = seller_email;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getBuyer_name() {
        return buyer_name;
    }

    public void setBuyer_name(String buyer_name) {
        this.buyer_name = buyer_name;
    }

    public String getSeller_name() {
        return seller_name;
    }

    public void setSeller_name(String seller_name) {
        this.seller_name = seller_name;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Order() {
    }
}
