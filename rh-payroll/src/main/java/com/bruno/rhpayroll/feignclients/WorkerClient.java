package com.bruno.rhpayroll.feignclients;

import com.bruno.rhpayroll.entities.Worker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "rh-worker",
            url = "localhost:8001",
            path = "/workers")
public interface WorkerClient {

    @GetMapping("/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id);
}
