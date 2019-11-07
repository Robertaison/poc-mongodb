package com.poc.mongo.status.mapping.response;

import com.poc.mongo.status.domain.WorkerInformation;
import lombok.Data;

@Data
public class WorkerResponse {

    private String name;

    private String job;

    private WorkerInformation workerInformation;

    private String dateAdmission;

    private String lastUpdate;
}
