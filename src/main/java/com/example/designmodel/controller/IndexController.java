package com.example.designmodel.controller;

import com.example.designmodel.strategy.NotNullStrategy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author junli wang
 * @date 18-9-9
 */

@RestController
public class IndexController {

    @GetMapping(value = "/index")
    public String index() {
        NotNullStrategy notNullStrategy = new NotNullStrategy();
        notNullStrategy.verify();
        return "success";
    }
}
