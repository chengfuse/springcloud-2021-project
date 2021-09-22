package com.example.springcloudzuulgateway;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableZuulProxy
@ComponentScan("com.example.*")
public class SpringcloudZuulGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudZuulGatewayApplication.class, args);
    }

}
