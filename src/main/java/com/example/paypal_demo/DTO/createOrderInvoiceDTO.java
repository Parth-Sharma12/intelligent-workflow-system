package com.example.paypal_demo.DTO;
import com.example.paypal_demo.Models.Order;
public class createOrderInvoiceDTO {
    private Order order;
    private Float extra_due;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Float getExtra_due() {
        return extra_due;
    }

    public void setExtra_due(Float extra_due) {
        this.extra_due = extra_due;
    }
}
