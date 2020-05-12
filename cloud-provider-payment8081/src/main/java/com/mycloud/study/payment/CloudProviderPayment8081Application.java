package com.mycloud.study.payment;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 24513
 */
@SpringBootApplication
@MapperScan("com.mycloud.study.payment.dao")
public class CloudProviderPayment8081Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderPayment8081Application.class, args);
    }

}
