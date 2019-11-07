package com.poc.mongo.status.mapping.request;

import com.poc.mongo.status.domain.WokerInformation;
import lombok.Getter;

@Getter
public class WorkerRequest {

    private String name;

    private String job;

    private WokerInformation wokerInformation;
}
