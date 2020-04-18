package com.julyatt.walhomesentinel.fallback;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author guosh28325
 * @Description
 * @date 2020-04-17 18:18
 */

@Component
public class EchoServiceFallbackFactory implements FallbackFactory<EchoServiceFallback> {

    @Override
    public EchoServiceFallback create(Throwable throwable) {
        return new EchoServiceFallback(throwable);
    }
}
