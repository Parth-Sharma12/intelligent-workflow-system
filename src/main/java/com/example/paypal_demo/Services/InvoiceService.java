package com.example.paypal_demo.Services;

import com.example.paypal_demo.Models.Invoice;
import com.example.paypal_demo.Repositories.HardCodedInvoiceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class InvoiceService {
    @Autowired
    private HardCodedInvoiceRepo repo;

    public Invoice createInvoice(Invoice invoice){
        return repo.createInvoice(invoice);
    }

    public String sendInvoice(Invoice invoice){
        return repo.sendInvoice(invoice);
    }

    public List<Invoice> getAllInvoices(){
        return repo.getAllInvoices();
    }
}
