package com.poc.mongo.status.mapping.response;

import com.poc.mongo.status.domain.WokerInformation;
import lombok.Data;
import lombok.Setter;

import java.time.LocalDateTime;

@Data
public class WorkerResponse {

    private String name;

    private String job;

    private WokerInformation wokerInformation;

    private LocalDateTime dateAdmission;

    private LocalDateTime lastUpdade;
}
