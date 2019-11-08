package com.poc.mongo.status.mapping.request;

import com.poc.mongo.status.domain.WorkerInformation;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class WorkerRequest {

    private String name;

    private String job;

    private WorkerInformationRequest workerInformation;
}
