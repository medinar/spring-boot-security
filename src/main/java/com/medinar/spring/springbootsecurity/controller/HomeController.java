package com.medinar.spring.springbootsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author rommelmedina
 */
@RestController
public class HomeController {
    
    @GetMapping("/")
    public String home(){
        return "<h1>Welcome</h1>";
    }
}
