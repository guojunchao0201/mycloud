package com.mycloud.study.payment.controller;

import com.mycloud.study.CommonResult;
import com.mycloud.study.dto.Payment;
import com.mycloud.study.payment.service.PaymentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author 24513
 */
@RestController
@Slf4j
@Api(tags = "payment接口")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String port;
    @PostMapping("/payment/create")
    @ApiOperation("添加订单接口")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("create-result:{}", result);
        if (result > 0) {
            return new CommonResult(200, "ok"+port);
        } else {
            return new CommonResult(500, "default");
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    @ApiOperation("根据id查询支付订单")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("获取payment{}",payment);
        if (payment != null) {
            return new CommonResult<Payment>(200, "ok"+port, payment);
        } else {
            return new CommonResult<Payment>(500, "default", null);
        }
    }
}
