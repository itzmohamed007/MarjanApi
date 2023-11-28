package com.youcode.marjanapi.Observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService {
    private final List<EmailMsgListener> customers;

    @Autowired
    public NotificationService(List<EmailMsgListener> customers) {
        this.customers = customers;
    }

    public void subscribe(EmailMsgListener customer) {
        customers.add(customer);
    }

    public void unsubscribe(EmailMsgListener customer) {
        customers.remove(customer);
    }

    public void notify() {
        customers.forEach(customer -> customer.update());
    }
}
