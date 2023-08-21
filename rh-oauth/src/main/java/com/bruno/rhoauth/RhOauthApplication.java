package com.bruno.rhoauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RhOauthApplication {

    public static void main(String[] args) {
        SpringApplication.run(RhOauthApplication.class, args);
    }

}
