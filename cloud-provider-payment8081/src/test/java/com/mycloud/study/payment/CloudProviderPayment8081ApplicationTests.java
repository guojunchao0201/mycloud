package com.mycloud.study.payment;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootTest
class CloudProviderPayment8081ApplicationTests {

    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() {
    }

    @Test
    public void testDruid() {
        System.out.println(dataSource);
    }

}
