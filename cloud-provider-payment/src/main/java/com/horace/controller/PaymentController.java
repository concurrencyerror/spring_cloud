package com.horace.controller;

import com.horace.service.PaymentService;
import common.CommonResult;
import entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;

/**
 * 2022/2/25
 * com.horace.controller
 * horace
 */
@RestController
@Slf4j
public class PaymentController {
    private final PaymentService paymentService;

    @Value( "${server.port}" )
    private String port;

    @Resource
    private DiscoveryClient client;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping( "/payment/create" )
    public CommonResult<Payment> create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("----------插入结果---------{}", result);
        if (result > 0) {
            return new CommonResult<>(200, "插入成功", payment);
        } else {
            return new CommonResult<>(500, "插入出错", payment);
        }
    }

    @GetMapping( "/payment/get/{id}" )
    public CommonResult<Payment> getPaymentById(@PathVariable Long id) {
        Payment payment = paymentService.getPaymentById(id);
        return new CommonResult<>(200, "查询成功,端口" + port, payment);
    }

    @GetMapping( "/payment/discovery" )
    public DiscoveryClient getDiscovery() {
        List<String> services = client.getServices();
        for (String service : services) {
            System.out.println(service);
            List<ServiceInstance> instances = client.getInstances(service);
            for (ServiceInstance instance : instances) {
                System.out.println(instance.getInstanceId()+instance.getHost()+instance.getPort()+instance.getUri());
            }
        }
        return client;
    }
}
