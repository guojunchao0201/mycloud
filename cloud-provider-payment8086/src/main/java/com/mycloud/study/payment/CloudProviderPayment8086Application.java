package com.mycloud.study.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudProviderPayment8086Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderPayment8086Application.class, args);
    }

}
