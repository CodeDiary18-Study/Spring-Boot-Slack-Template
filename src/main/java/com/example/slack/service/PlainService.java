package com.example.slack.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class PlainService {
    @Value("${webhook.slack.url}")
    private String SLACK_WEBHOOK_URL;

    /**
     * 슬랙 메시지 전송
     **/
    public void sendMessage(String message) {
        RestTemplate restTemplate = new RestTemplate();

        Map<String, Object> request = new HashMap<>();
        request.put("username", "webhookbot"); // 봇 이름
        request.put("text", message);

        HttpEntity<Map<String, Object>> entity = new HttpEntity<>(request);
        restTemplate.exchange(SLACK_WEBHOOK_URL, org.springframework.http.HttpMethod.POST, entity, String.class);
    }
}
