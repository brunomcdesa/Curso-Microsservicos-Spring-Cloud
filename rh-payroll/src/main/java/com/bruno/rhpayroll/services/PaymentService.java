package com.bruno.rhpayroll.services;

import com.bruno.rhpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(Long workerId, int days) {
        return new Payment("Bruno", 200.0, days);
    }
}
