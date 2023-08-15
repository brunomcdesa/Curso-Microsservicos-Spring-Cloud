package com.bruno.rhconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class RhConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RhConfigServerApplication.class, args);
    }

}
