package com.julyatt.walhomesentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.julyatt.walhomesentinel.feign.TestFeignSerice;
import com.julyatt.walhomesentinel.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guosh28325
 * @Description
 * @date 2020-04-16 17:43
 */

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @Autowired
    private TestFeignSerice testFeignSerice;

    @GetMapping(value = "/hello/{name}")
    public String hello(@PathVariable String name) {
        return testFeignSerice.echo(name);
    }
}
