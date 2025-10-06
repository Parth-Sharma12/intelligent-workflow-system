package com.example.paypal_demo.Repositories;

import com.example.paypal_demo.Models.Invoice;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class HardCodedInvoiceRepo implements InvoiceRepo {

    private final List<Invoice> invoices = new ArrayList<Invoice>();
    private int nextId = 1;


    // Create and store an invoice
    @Override
    public Invoice createInvoice(Invoice invoice) {
        invoice.setInvoice_id(nextId++);
        invoice.setPayer_name(invoice.getPayer_name());
        invoice.setSeller_name(invoice.getSeller_name());
        invoice.setAmount(invoice.getAmount());
        invoice.setExtra_due(invoice.getExtra_due());
        invoice.setDescription(invoice.getDescription());
        invoices.add(invoice);
        return invoice;
    }

    // "Send" invoice (just a simulation)
    public String sendInvoice(int invoiceId) {
        Optional<Invoice> invoiceOpt = invoices.stream()
                .filter(inv -> inv.getInvoice_id() == invoiceId)
                .findFirst();

        // Here you can simulate sending via email or just mark it as sent
        return invoiceOpt.map(invoice -> "Invoice ID " + invoiceId + " sent to " + invoice.getPayer_name()).orElseGet(() -> "Invoice ID " + invoiceId + " not found");
    }

    // Get all invoices
    public List<Invoice> getAllInvoices() {
        return invoices;
    }
}
