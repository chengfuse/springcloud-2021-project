package com.example.springcloudproviderbook8012;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@ComponentScan("com.example.*")
@MapperScan("com.example.dao")
@EnableHystrix
public class SpringcloudProviderBook8012Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudProviderBook8012Application.class, args);
    }

}
