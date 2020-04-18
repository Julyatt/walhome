package com.julyatt.walhomenacosconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * http://localhost:8082/v2/api-docs
 * http://localhost:8082/swagger-ui.html
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2
public class WalhomeNacosConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WalhomeNacosConsumerApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
