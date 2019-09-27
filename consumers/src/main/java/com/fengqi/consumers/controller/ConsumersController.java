package com.fengqi.consumers.controller;

import com.fengqi.api.ApiService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class ConsumersController {

    @Reference(version = "1.0.0")
    private ApiService apiService;

    @GetMapping
    public String getProviders() {
        return apiService.sayHello("李特");
    }
}
