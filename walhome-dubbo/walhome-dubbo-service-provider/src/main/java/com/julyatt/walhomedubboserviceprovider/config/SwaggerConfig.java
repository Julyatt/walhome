package com.julyatt.walhomedubboserviceprovider.config;

import com.deepoove.swagger.dubbo.annotations.EnableDubboSwagger;
import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;

/**
 * @author guosh28325
 * @Description
 * @date 2020-04-18 14:07
 */

@DubboComponentScan(basePackages = { "com.julyatt.walhomedubboserviceprovider.service" })
@EnableDubboSwagger
@Configuration
public class SwaggerConfig {

}
