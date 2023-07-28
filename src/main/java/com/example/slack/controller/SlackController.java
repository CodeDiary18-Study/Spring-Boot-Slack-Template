package com.example.slack.controller;

import com.example.slack.dto.SlackMessageRequest;
import com.example.slack.service.SlackService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/slack")
@RequiredArgsConstructor
public class SlackController {
    private final SlackService slackService;

    @PostMapping("/send")
    public String sendMessage(@RequestBody @Valid SlackMessageRequest request) {
        try {
            slackService.sendMessage(request.getTitle(), request.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }

        return "success";
    }
}
