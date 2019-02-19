package com.github.abangopen.fastms.configcenterservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigCenterServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterServiceApplication.class, args);
    }

}

