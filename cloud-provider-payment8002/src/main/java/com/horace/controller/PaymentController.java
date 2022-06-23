package com.horace.controller;

import com.horace.service.PaymentService;
import common.CommonResult;
import entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * 2022/2/25
 * com.horace.controller
 * horace
 */
@RestController
@Slf4j
public class PaymentController {
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payment/create")
    public CommonResult<Payment> create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("----------插入结果---------{}", result);
        if (result > 0) {
            return new CommonResult<>(200, "插入成功", payment);
        } else {
            return new CommonResult<>(500, "插入出错", payment);
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable Long id) {
        Payment payment = paymentService.getPaymentById(id);
        return new CommonResult<>(200, "查询成功", payment);
    }
}
