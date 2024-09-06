package com.springboot.demo.myspringapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    /*
    Expose "/" hello world endpoint
     */
    @GetMapping("/")
    public String hello() {
        return "Hello Spring world!";
    }
}
