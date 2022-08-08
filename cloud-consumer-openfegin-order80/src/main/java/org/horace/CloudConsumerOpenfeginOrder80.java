package org.horace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CloudConsumerOpenfeginOrder80 {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerOpenfeginOrder80.class, args);
    }
}
