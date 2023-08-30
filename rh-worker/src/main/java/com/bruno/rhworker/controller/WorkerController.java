package com.bruno.rhworker.controller;

import com.bruno.rhworker.entities.Worker;
import com.bruno.rhworker.repositories.WorkerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value ="/workers")
@RequiredArgsConstructor
@Slf4j
@RefreshScope
public class WorkerController {

    private final WorkerRepository workerRepository;
    private final Environment env;


    @GetMapping("configs")
    public ResponseEntity<Void> getConfigs() {
        //
        //
        // log.info("Config = " + testConfig);
        return ResponseEntity.noContent().build();
    }


    @GetMapping
	public ResponseEntity<List<Worker>> findAll() {
        var lista = workerRepository.findAll();
        return ResponseEntity.ok(lista);
    }

    @GetMapping("{id}")
    public ResponseEntity<Optional<Worker>> findById(@PathVariable Long id) throws InterruptedException {
//        Thread.sleep(3000L);

        log.info("PORTA = ".concat(env.getProperty("local.server.port")));
        var worker = workerRepository.findById(id);
        return ResponseEntity.ok(worker);
    }
}
