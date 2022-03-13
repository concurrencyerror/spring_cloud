package com.horace.controller;

import common.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 2022/3/13
 * com.horace.controller
 * horace
 */
@RestController
public class OderConsumerZkp {
    private static final String PAYMENT_URL = "http://cloud-provider-payment";
    private final RestTemplate restTemplate;

    public OderConsumerZkp(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/consumer/getOder")
    public String getOder(){
        return restTemplate.getForObject(PAYMENT_URL + "/payment/zk", String.class);
    }
}
