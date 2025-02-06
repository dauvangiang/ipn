package com.dvgiang.ipndemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ipn")
public class IPNController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
