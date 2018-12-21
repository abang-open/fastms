package com.github.abangopen.fastms.registercenterservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegisterCenterServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegisterCenterServiceApplication.class, args);
    }

}

