package com.example.paypal_demo.Models;

import java.sql.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int invoice_id;
    private String payer_name;
    private String payer_email;
    private String seller_name;
    private String seller_email;
    private Float amount;
    private Float extra_due;
    private String description;

    public Invoice() {
    }

    public Invoice(int invoice_id, String payer_name, String payer_email, String seller_name, String seller_email, Float amount, Float extra_due, String description) {
        this.invoice_id = invoice_id;
        this.payer_name = payer_name;
        this.payer_email = payer_email;
        this.seller_name = seller_name;
        this.seller_email = seller_email;
        this.amount = amount;
        this.extra_due = extra_due;
        this.description = description;
    }

    public String getPayer_email() {
        return payer_email;
    }

    public void setPayer_email(String payer_email) {
        this.payer_email = payer_email;
    }

    public String getSeller_email() {
        return seller_email;
    }

    public void setSeller_email(String seller_email) {
        this.seller_email = seller_email;
    }

    public int getInvoice_id() {
        return invoice_id;
    }

    public void setInvoice_id(int invoice_id) {
        this.invoice_id = invoice_id;
    }

    public String getPayer_name() {
        return payer_name;
    }

    public void setPayer_name(String payer_name) {
        this.payer_name = payer_name;
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

    public Float getExtra_due() {
        return extra_due;
    }

    public void setExtra_due(Float extra_due) {
        this.extra_due = extra_due;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
