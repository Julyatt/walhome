package com.julyatt.walhomesentinel.feign;

import com.julyatt.walhomesentinel.fallback.EchoServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author guosh28325
 * @Description
 * @date 2020-04-17 17:32
 */

@FeignClient(name = "nacos-provider", fallbackFactory = EchoServiceFallbackFactory.class)
public interface TestFeignSerice {

    @GetMapping(value = "/echo/{str}")
    String echo(@PathVariable("str") String str);

    /*class FeignConfiguration {
        @Bean
        public TestFeignSericeFallback testFeignSericeFallback() {
            return new TestFeignSericeFallback();
        }
    }
    class TestFeignSericeFallback implements TestFeignSerice{
        @Override
        public String echo(@PathVariable("str") String str) {
            return "echo fallback";
        }
    }*/
}


