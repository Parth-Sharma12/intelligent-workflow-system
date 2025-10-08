package com.example.paypal_demo.MailService;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.SimpleMailMessage;

import org.springframework.stereotype.Service;

@Service
public class MailTrap {
    private final JavaMailSender mailSender;


    public MailTrap(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public String sendMail(String to,String Body, String Subject){
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(to);
        msg.setSubject(Subject);
        msg.setText(Body);
        mailSender.send(msg);
        return "Email sent to " + to;
    }
}
