package com.lmx.server1.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lmx
 * @create: 2020/6/25
 **/
@RestController
@RefreshScope
public class HelloController {

    @Value("${server.port}")
    private Integer port;

    @Value("${demo.name}")
    private String name;

    @GetMapping("/hello")
    public String getHello(){
        return "hello this is port" + port;
    }

    @GetMapping("/name")
    public String userName(){
        return "this nacos name :" + name;
    }

}
