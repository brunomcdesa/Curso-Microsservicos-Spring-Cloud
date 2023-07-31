package com.bruno.rhpayroll.services;

import com.bruno.rhpayroll.entities.Payment;
import com.bruno.rhpayroll.entities.Worker;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

@Service
@RequiredArgsConstructor
public class PaymentService {

    @Value("${rh-worker.host}")
    private String workerHost;

    private final RestTemplate restTemplate;

    public Payment getPayment(Long workerId, int days) {
        var uriVariables = new HashMap<>();
        uriVariables.put("id", workerId.toString());


        var worker = restTemplate.getForObject(workerHost + "/workers/{id}", Worker.class, uriVariables);
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
