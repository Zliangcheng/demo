package com.zliangcheng.firstdemo.adapter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String printHello() {
        return "Hello World~";
    }

}
