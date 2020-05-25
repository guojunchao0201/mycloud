package com.mycloud.study.feignorder.service;

import com.mycloud.study.CommonResult;
import com.mycloud.study.dto.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author guojunchao
 */
@Service
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface OrderService {

    @GetMapping(value = "/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping("/payment/test/timeOut")
    String testTimeOut();
}
