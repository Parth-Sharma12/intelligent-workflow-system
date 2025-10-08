package com.example.paypal_demo.Repositories;

import com.example.paypal_demo.MailService.MailTrap;
import com.example.paypal_demo.Models.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class HardCodedInvoiceRepo implements InvoiceRepo {

    private final MailTrap mailtrap;

    private final List<Invoice> invoices = new ArrayList<Invoice>();
    private int nextId = 1;

    public HardCodedInvoiceRepo(MailTrap mailtrap) {

        this.mailtrap = mailtrap;
        invoices.add(new Invoice(1, "John Doe", "john.doe@example.com", "Acme Corp", "sales@acmecorp.com",
                2500.75f, 50.25f, "Enterprise software license payment"));

        invoices.add(new Invoice(2, "Alice Johnson", "alice.j@example.com", "TechNova", "billing@technova.io",
                1250.50f, 25.50f, "Cloud hosting service renewal"));

        invoices.add(new Invoice(3, "Bob Williams", "bob.w@example.com", "Designify", "invoices@designify.com",
                890.00f, 10.00f, "UI/UX design services"));

        invoices.add(new Invoice(4, "Sarah Lee", "sarah.lee@example.com", "ByteWorks", "accounts@byteworks.co",
                3200.00f, 80.00f, "Custom web application development project"));
    }

    // Create and store an invoice
    @Override
    public Invoice createInvoice(Invoice invoice) {
        invoice.setInvoice_id(nextId++);
        invoice.setPayer_name(invoice.getPayer_name());
        invoice.setSeller_name(invoice.getSeller_name());
        invoice.setAmount(invoice.getAmount());
        invoice.setExtra_due(invoice.getExtra_due());
        invoice.setDescription(invoice.getDescription());
        invoice.setPayer_email(invoice.getPayer_email());
        invoice.setSeller_email(invoice.getSeller_email());
        invoices.add(invoice);
        return invoice;
    }

    // "Send" invoice (just a simulation)
    public String sendInvoice(Invoice invoice) {

       String Subject = "Invoice from " + invoice.getSeller_name() + invoice.getSeller_email();
       String body = String.format("""
                Hello %s,
                
                Here are your invoice details:
                ---------------------------------
                Invoice ID: %d
                Seller: %s
                Amount: %.2f
                Extra Due: %.2f
                Description: %s
                
                Thank you for your business!
                ---------------------------------
                """,
                invoice.getPayer_name(),
                invoice.getInvoice_id(),
                invoice.getSeller_name(),
                invoice.getAmount(),
                invoice.getExtra_due(),
                invoice.getDescription()
        );
       System.out.println("Would send mail to: " + invoice.getPayer_email());
       return mailtrap.sendMail(invoice.getPayer_email(),Subject,body);

    }

    // Get all invoices
    public List<Invoice> getAllInvoices() {
        return invoices;
    }
}
