package org.horace.controller;

import lombok.extern.slf4j.Slf4j;
import org.horace.service.PaymentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 2022/6/19
 * org.horace.controller
 * horace
 */
@RestController
@Slf4j
public class PaymentController {
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping("/payment/hystrix/payment/ok/{id}")
    public String getPayment(@PathVariable("id") Integer id) {
        return paymentService.paymentInfo(id);
    }

    @GetMapping("/payment/hystrix/payment/bad/{id}")
    public String getBadPayment(@PathVariable("id") Integer id) {
        return paymentService.paymentInfoTimeOut(id);
    }
}
