package com.julyatt.walhomesentinel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class WalhomeSentinelApplication {

    public static void main(String[] args) {
        SpringApplication.run(WalhomeSentinelApplication.class, args);
    }

}
