package com.bruno.rhworker.controller;

import com.bruno.rhworker.entities.Worker;
import com.bruno.rhworker.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value ="/workers")
public class WorkerController {

    @Autowired
    private WorkerRepository workerRepository;

    @GetMapping
	public ResponseEntity<List<Worker>> findAll() {
        List<Worker> lista = workerRepository.findAll();
        return ResponseEntity.ok(lista);
    }

    @GetMapping("{id}")
    public ResponseEntity<Optional<Worker>> findById(@PathVariable Long id) {
        Optional<Worker> worker = workerRepository.findById(id);
        return ResponseEntity.ok(worker);
    }
}
