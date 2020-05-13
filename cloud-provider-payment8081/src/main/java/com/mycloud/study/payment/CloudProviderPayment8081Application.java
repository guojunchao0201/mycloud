package com.mycloud.study.payment;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 24513
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.mycloud.study.payment.dao")
public class CloudProviderPayment8081Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderPayment8081Application.class, args);
    }

}
