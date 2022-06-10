package org.horace.service;

import common.CommonResult;
import entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "cloud-payment-service")
public interface PayFeignService {
    @GetMapping( "/payment/get/{id}" )
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);
}
