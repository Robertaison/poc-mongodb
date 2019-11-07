package com.poc.mongo.status.mapping.response;

import lombok.Data;
import lombok.Setter;

@Data
public class ContactResponse {

    private String phoneNumber;

    private String email;
}
