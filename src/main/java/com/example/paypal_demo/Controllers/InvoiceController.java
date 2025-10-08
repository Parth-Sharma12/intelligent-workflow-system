package com.example.paypal_demo.Controllers;

import com.example.paypal_demo.Models.Invoice;
import com.example.paypal_demo.Repositories.InvoiceRepo;
import com.example.paypal_demo.Services.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/Invoice")
public class InvoiceController {
    @Autowired
    private InvoiceService service;

    @PostMapping("/create_invoice")
    public Invoice createInvoice(@RequestBody Invoice invoice){
        return service.createInvoice(invoice);
    }

//    @PostMapping("/send_invoice/{invoiceId}")
//    public String sendInvoice(@PathVariable int invoiceId){
//        return service.sendInvoice(invoiceId);
//    }

    @GetMapping("/get_all_invoices")
    public List<Invoice> getAllInvoices(){
        return service.getAllInvoices();
    }

}
