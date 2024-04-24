package com.test.testhello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/public")
public class controller {
    @GetMapping("/helloworld")
    public String helloWorld() {
        return "خدایا بسه دیگه!!!";
    }

}