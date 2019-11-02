package com.demo.thymeleaf.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

    @RequestMapping("/log")
    public Map<String, Object> log() {
        Logger logger = LoggerFactory.getLogger(LogController.class);
        Map<String, Object> result = new HashMap<>();
        logger.info("Info Message");
        logger.warn("Warning message");
        logger.error("error Message");
        result.put("helllo", "helllllo");
        return result;
    }
}