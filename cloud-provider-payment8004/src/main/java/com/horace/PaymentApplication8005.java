package com.horace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 2022/3/13
 * PACKAGE_NAME
 * horace
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentApplication8005 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication8005.class,args);
    }
}
