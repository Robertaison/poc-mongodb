package com.poc.mongo.status.mapping.request;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ContactResquest {

    private String phoneNumber;

    private String email;
}
