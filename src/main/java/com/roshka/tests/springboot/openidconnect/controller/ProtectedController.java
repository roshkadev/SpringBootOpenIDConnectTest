package com.roshka.tests.springboot.openidconnect.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/protected")
public class ProtectedController {

    @GetMapping("/data")
    public String protectedEndpoint() {
        return "protected";
    }

}
