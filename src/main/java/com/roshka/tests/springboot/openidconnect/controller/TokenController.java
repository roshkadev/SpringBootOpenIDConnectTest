package com.roshka.tests.springboot.openidconnect.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/token")
public class TokenController {

    @GetMapping("/code")
    public String getCode(HttpServletRequest request) {
        return "code";
    }
}
