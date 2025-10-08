package com.example.paypal_demo.Controllers;

import com.example.paypal_demo.DTO.createOrderInvoiceDTO;
import com.example.paypal_demo.Models.Order;
import com.example.paypal_demo.Workflows.OrderInvoiceWorkflow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/workflow")
public class workflowController {

    @Autowired
    private OrderInvoiceWorkflow workflow;

    @PostMapping("/CreateOrder-invoice")
    public String createOrderandInvoice(@RequestBody createOrderInvoiceDTO request) {
        return workflow.createOrderAndInvoice(request.getOrder(),request.getExtra_due());
    }
}
