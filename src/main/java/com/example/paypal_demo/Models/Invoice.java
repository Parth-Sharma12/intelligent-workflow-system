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
    private String seller_name;
    private Date date;
    private Float amount;
    private Float extra_due;
    private String description;

    public Invoice() {
    }

    public Invoice(int invoice_id, String payer_name, String seller_name, Date date, Float amount, Float extra_due, String description) {
        this.invoice_id = invoice_id;
        this.payer_name = payer_name;
        this.seller_name = seller_name;
        this.date = date;
        this.amount = amount;
        this.extra_due = extra_due;
        this.description = description;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
