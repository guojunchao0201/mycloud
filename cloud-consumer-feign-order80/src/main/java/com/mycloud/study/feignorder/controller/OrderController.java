package com.mycloud.study.feignorder.controller;

import com.mycloud.study.CommonResult;
import com.mycloud.study.dto.Payment;
import com.mycloud.study.feignorder.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guojunchao
 */
@RestController
public class OrderController {

    @Autowired
    OrderService service;

    @GetMapping(value = "/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        return service.getPaymentById(id);
    }


    @GetMapping("/payment/test/timeOut")
    String testTimeOut() {
        return service.testTimeOut();
    }
}
