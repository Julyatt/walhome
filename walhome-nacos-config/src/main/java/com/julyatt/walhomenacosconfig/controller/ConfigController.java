package com.julyatt.walhomenacosconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guosh28325
 * @Description
 * @date 2020-04-09 19:56
 */

@RestController
@RefreshScope
public class ConfigController {
    @Value("${nacos:false}")
    private String nacos;

    @RequestMapping("/get")
    public String get(){
        return nacos;
    }
}
