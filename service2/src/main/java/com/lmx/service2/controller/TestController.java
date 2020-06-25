package com.lmx.service2.controller;

import com.lmx.service2.client.HelloFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lmx
 * @create: 2020/6/25
 **/
@RestController
public class TestController {

    @Autowired
    private HelloFeignClient feignClient;

    @GetMapping("/test")
    public String getTest(){
        return feignClient.getHello();
    }

}
