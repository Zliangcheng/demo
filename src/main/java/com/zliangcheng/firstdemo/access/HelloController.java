package com.zliangcheng.firstdemo.access;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String printHello() {
        return "Hello World~";
    }
}
