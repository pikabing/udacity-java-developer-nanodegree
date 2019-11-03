package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class DemoController {
    private Map<String, Object> result = new HashMap<String, Object>();
    
    @RequestMapping("/demo")
    public Map<String, Object> demo() {
        result.put("name", "Stephen");
        result.put("city", "San Jose");
        return result;
    }
    
}