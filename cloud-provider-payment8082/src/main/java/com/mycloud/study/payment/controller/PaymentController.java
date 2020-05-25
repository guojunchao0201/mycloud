package com.mycloud.study.payment.controller;

import com.mycloud.study.CommonResult;
import com.mycloud.study.dto.Payment;
import com.mycloud.study.payment.service.PaymentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 24513
 */
@RestController
@Slf4j
@Api(tags = "payment接口")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Autowired
    private DiscoveryClient discoveryClient;

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

    @GetMapping("/test/discovery")
    @ApiOperation("测试discovery功能")
    public Object getDiscovery() {
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            log.info("service: " + service);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info("host: {},port: {},url: {},serviceId: {},instanceId: {}", instance.getHost(),
                    instance.getPort(), instance.getUri(), instance.getServiceId(), instance.getInstanceId());
        }
        return instances;
    }

    @GetMapping("/payment/test/timeOut")
    public String testTimeOut() {
        try {
            Thread.sleep(3000);
            return "测试超时";
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "==";

    }
}
