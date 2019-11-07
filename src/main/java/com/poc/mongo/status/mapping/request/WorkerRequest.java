package com.poc.mongo.status.mapping.request;

import com.poc.mongo.status.domain.WorkerInformation;
import lombok.Getter;

@Getter
public class WorkerRequest {

    private String name;

    private String job;

    private WorkerInformation workerInformation;
}
