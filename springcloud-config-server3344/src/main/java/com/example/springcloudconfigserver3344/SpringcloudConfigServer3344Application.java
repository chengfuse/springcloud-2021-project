package com.example.springcloudconfigserver3344;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringcloudConfigServer3344Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConfigServer3344Application.class, args);
    }

}
