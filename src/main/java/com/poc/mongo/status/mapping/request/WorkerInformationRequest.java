package com.poc.mongo.status.mapping.request;

import com.poc.mongo.status.domain.Contact;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class WorkerInformationRequest {

    private String document;

    private LocalDateTime birthDate;

    private ContactResquest contact;
}
