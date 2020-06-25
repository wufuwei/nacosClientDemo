package com.lmx.service2.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: lmx
 * @create: 2020/6/25
 **/
@FeignClient("service1")
public interface HelloFeignClient {

    @GetMapping("/hello")
    String getHello();
}
