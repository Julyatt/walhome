package com.julyatt.walhomedubboserviceprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author guosh28325
 * @Description
 * @date 2020-04-18 10:41
 */

@SpringBootApplication
@EnableDiscoveryClient
public class WalhomeDubboServiceProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(WalhomeDubboServiceProviderApplication.class, args);
    }
}
