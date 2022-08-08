package org.horace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 主启动类
 */
@SpringBootApplication
@EnableFeignClients
public class CloudConsumerOpenfeginHystrixOrder80 {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerOpenfeginHystrixOrder80.class, args);
    }
}
