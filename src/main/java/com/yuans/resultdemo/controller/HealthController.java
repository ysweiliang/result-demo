package com.yuans.resultdemo.controller;

import com.yuans.resultdemo.annonation.NotControllerResponseAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: ys
 * @CreateTime: 2022-07-20  17:05
 */
@RestController
public class HealthController {
    @GetMapping("/health")
    @NotControllerResponseAdvice
    public String health() {
        return "success";
    }
}