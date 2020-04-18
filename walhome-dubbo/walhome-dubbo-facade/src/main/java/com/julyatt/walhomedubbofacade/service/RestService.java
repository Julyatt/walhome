package com.julyatt.walhomedubbofacade.service;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author guosh28325
 * @Description
 * @date 2020-04-18 10:11
 */

@Api("dubbo接口测试")
public interface RestService {

    @ApiOperation(value = "dubbo接口 hello")
    String hello(String name);

}
