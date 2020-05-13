package com.mycloud.study.payment;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.mycloud.study.payment.dao")
public class CloudProviderPayment8082Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderPayment8082Application.class, args);
    }

}
