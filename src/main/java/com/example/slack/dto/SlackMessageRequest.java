package com.example.slack.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.HashMap;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SlackMessageRequest {
    @NotEmpty
    private String title;

    @NotEmpty
    private HashMap<String, String> message;
}
