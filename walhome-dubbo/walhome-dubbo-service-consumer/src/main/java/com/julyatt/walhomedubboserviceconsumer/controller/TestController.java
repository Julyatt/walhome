package com.julyatt.walhomedubboserviceconsumer.controller;

import com.julyatt.walhomedubbofacade.service.RestService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guosh28325
 * @Description
 * @date 2020-04-18 11:02
 */

@RestController
public class TestController {

    @Reference
    RestService restService;

    @GetMapping("/test")
    public String test() {
        return restService.hello("ccs");
    }

}
