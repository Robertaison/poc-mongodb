package com.poc.mongo.status.mapping.response;

import com.poc.mongo.status.domain.Contact;
import lombok.Data;
import lombok.Setter;

import java.time.LocalDateTime;

@Data
public class WorkerInformationResponse {

    private String document;

    private LocalDateTime birthDate;

    private Contact contact;
}
