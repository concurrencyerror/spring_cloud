package org.horace.controller;

import common.CommonResult;
import entity.Payment;
import org.horace.service.PayFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayFeignController {
    private final PayFeignService payFeignService;

    public PayFeignController(PayFeignService payFeignService) {
        this.payFeignService = payFeignService;
    }

    @GetMapping("/consumer/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        return payFeignService.getPaymentById(id);
    }
}
