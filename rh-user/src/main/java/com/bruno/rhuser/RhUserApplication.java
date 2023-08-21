package com.bruno.rhuser;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableEurekaClient
@RequiredArgsConstructor
public class RhUserApplication implements CommandLineRunner {

    private final BCryptPasswordEncoder passwordEncoder;

    public static void main(String[] args) {
        SpringApplication.run(RhUserApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       // System.out.println("BCRYPT = " + passwordEncoder.encode("123456"));
    }
}
