package com.example.paypal_demo.Repositories;

import com.example.paypal_demo.Models.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceRepo {
    public Invoice createInvoice(Invoice invoice);

    public String sendInvoice(int invoiceId);
    public List<Invoice> getAllInvoices();
}
