package com.poc.mongo.status.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class WokerInformation {

    private String document;

    private LocalDateTime birthDate;

    private Contact contact;
}
