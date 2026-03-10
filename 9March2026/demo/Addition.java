package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Addition {
    @GetMapping("/add")
    public int addNumbers(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }
     @GetMapping("/add/{a}/{b}")
     public int addNumber(@PathVariable int a, @PathVariable int b) {
        return a + b;
    }
    @PostMapping("/add")
    public int addNumbers(@RequestBody Numbers num) {
        return num.getA() + num.getB();
    }

    
}


