package com.example.slack.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PlainServiceTest {
    @Autowired
    PlainService plainService;

    @Test
    @DisplayName("RestTemplate을 이용한 Slack 메시지 전송")
    void sendMessage() {
        String message = "RestTemplate을 이용한 Slack 메시지 전송 테스트";

        plainService.sendMessage(message);
    }
}
