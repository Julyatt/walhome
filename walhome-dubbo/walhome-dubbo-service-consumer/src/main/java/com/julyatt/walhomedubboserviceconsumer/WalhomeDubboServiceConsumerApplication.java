package com.julyatt.walhomedubboserviceconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author guosh28325
 * @Description
 * @date 2020-04-18 10:57
 */

@EnableDiscoveryClient
@SpringBootApplication
public class WalhomeDubboServiceConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WalhomeDubboServiceConsumerApplication.class, args);
    }

}
