package com.example.sprintcloudconumser80;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.*")
@EnableFeignClients(basePackages = {"com.example"})
@EnableEurekaClient
@EnableDiscoveryClient
public class SprintcloudConumser80Application {

    public static void main(String[] args) {
        SpringApplication.run(SprintcloudConumser80Application.class, args);
    }

}
