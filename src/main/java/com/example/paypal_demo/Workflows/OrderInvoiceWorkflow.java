package com.example.paypal_demo.Workflows;

import com.example.paypal_demo.Models.Invoice;
import com.example.paypal_demo.Models.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.paypal_demo.Services.OrderService;
import com.example.paypal_demo.Services.InvoiceService;

@Service
public class OrderInvoiceWorkflow {
    @Autowired
    private OrderService orderService;

    @Autowired
    private InvoiceService invoiceService;

    public String createOrderAndInvoice(Order order,Float extraDue) {
        System.out.println("Entered in createOrderAndInvoice function");
        int ord1 = orderService.create_order(order);

        Invoice invoice = new Invoice();
        invoice.setInvoice_id(order.getOrder_id());
        invoice.setAmount(order.getAmount());
        invoice.setSeller_name(order.getSeller_name());
        invoice.setPayer_name(order.getSeller_name());
        invoice.setDescription(order.getDescription());
        invoice.setExtra_due(extraDue);
        invoice.setSeller_email(order.getSeller_email());
        invoice.setPayer_email(order.getBuyer_email());

        Invoice inv1 = invoiceService.createInvoice(invoice);
        return invoiceService.sendInvoice(inv1);
    }
}
