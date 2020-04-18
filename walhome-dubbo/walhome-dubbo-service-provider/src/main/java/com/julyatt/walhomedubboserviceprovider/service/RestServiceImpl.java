package com.julyatt.walhomedubboserviceprovider.service;

import com.julyatt.walhomedubbofacade.service.RestService;
import io.swagger.annotations.Api;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author guosh28325
 * @Description
 * @date 2020-04-18 10:42
 */

@Service
@Api(value = "帐号服务")
public class RestServiceImpl implements RestService {

    @Override
    public String hello(String name) {
        return "hello" + name;
    }
}
