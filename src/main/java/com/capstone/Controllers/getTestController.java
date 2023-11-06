package com.capstone.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class getTestController {
    @GetMapping("/")
    public String getTest(){
        return "Testing Get API";
    }
}
