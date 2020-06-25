package com.lmx.server1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lmx
 * @create: 2020/6/25
 **/
@RestController
public class HelloController {

    @Value("${server.port}")
    private Integer port;

    @GetMapping("/hello")
    public String getHello(){
        return "hello this is port" + port;
    }

}
