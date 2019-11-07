package com.poc.mongo.status.domain;

import lombok.Data;

@Data
public class WorkerInformation {

    private String document;

    private String birthDate;

    private Contact contact;
}
