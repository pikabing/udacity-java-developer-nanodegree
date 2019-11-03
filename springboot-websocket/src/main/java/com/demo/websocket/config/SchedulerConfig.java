package com.demo.websocket.config;

import com.demo.websocket.model.UserResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
@Configuration
public class SchedulerConfig {

    @Autowired
    SimpMessagingTemplate simpMessagingTemplate;

    @Scheduled(fixedDelay = 5000)
    public void sendAdhocMessages() {
        simpMessagingTemplate.convertAndSend("/topic/user", new UserResponse("Scheduler"));
    }
}