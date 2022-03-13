package com.horace.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * 2022/3/13
 * PACKAGE_NAME
 * horace
 */
@RestController
public class PaymentController {

    @Value( "${server.port}" )
    private String port;

    @GetMapping( "/payment/zk" )
    public String getZookeeperTest() {
        return "端口：" + port + "随机号：" + UUID.randomUUID();
    }

}
