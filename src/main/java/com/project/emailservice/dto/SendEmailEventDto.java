package com.project.emailservice.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SendEmailEventDto {
    private String to;
    private String from;
    private String subject;
    private String body;
}
