package com.bruno.rhpayroll.services;

import com.bruno.rhpayroll.entities.Payment;
import com.bruno.rhpayroll.entities.Worker;
import com.bruno.rhpayroll.feignclients.WorkerClient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final WorkerClient workerClient;

    public Payment getPayment(Long workerId, int days) {
        var worker = workerClient.findById(workerId).getBody();
        assert worker != null;
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
