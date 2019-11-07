package com.poc.mongo.status.mapping.request;

import com.poc.mongo.status.domain.Contact;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class WorkerInformationRequest {

    private String document;

    private LocalDateTime birthDate;

    private Contact contact;
}
