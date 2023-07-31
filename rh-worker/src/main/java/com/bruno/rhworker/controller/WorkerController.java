package com.bruno.rhworker.controller;

import com.bruno.rhworker.entities.Worker;
import com.bruno.rhworker.repositories.WorkerRepository;
import lombok.RequiredArgsConstructor;
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
public class WorkerController {

    private final WorkerRepository workerRepository;

    @GetMapping
	public ResponseEntity<List<Worker>> findAll() {
        var lista = workerRepository.findAll();
        return ResponseEntity.ok(lista);
    }

    @GetMapping("{id}")
    public ResponseEntity<Optional<Worker>> findById(@PathVariable Long id) {
        var worker = workerRepository.findById(id);
        return ResponseEntity.ok(worker);
    }
}
