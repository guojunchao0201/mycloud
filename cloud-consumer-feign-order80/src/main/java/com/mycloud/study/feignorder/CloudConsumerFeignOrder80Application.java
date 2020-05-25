package com.mycloud.study.feignorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author guojunchao
 */
@SpringBootApplication
@EnableFeignClients
public class CloudConsumerFeignOrder80Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerFeignOrder80Application.class, args);
    }

}
