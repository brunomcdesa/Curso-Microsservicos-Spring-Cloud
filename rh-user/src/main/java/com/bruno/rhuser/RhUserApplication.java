package com.bruno.rhuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RhUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(RhUserApplication.class, args);
    }

}
