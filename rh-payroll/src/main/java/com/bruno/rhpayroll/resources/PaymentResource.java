package com.bruno.rhpayroll.resources;

import com.bruno.rhpayroll.entities.Payment;
import com.bruno.rhpayroll.services.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
@RequiredArgsConstructor
public class PaymentResource {

    private final PaymentService paymentService;

    @GetMapping("{id}/days/{days}")
    public ResponseEntity<Payment> getPayment(@PathVariable Long id, @PathVariable Integer days) {
        Payment payment = paymentService.getPayment(id, days);

        return ResponseEntity.ok(payment);
    }
}
