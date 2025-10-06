package com.example.paypal_demo.Repositories;

import com.example.paypal_demo.Models.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepo extends JpaRepository<Invoice,Integer> {
}
