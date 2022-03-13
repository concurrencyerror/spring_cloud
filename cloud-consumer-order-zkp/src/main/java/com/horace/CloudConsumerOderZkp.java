package com.horace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 2022/3/13
 * com.horace
 * horace
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudConsumerOderZkp {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerOderZkp.class, args);
    }
}
