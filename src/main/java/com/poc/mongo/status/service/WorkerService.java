package com.poc.mongo.status.service;

import com.poc.mongo.status.mapping.request.WorkerRequest;
import com.poc.mongo.status.mapping.response.WorkerResponse;

import java.util.List;

public interface WorkerService {

    WorkerResponse getWorker(String name);

    void save(WorkerRequest workerRequest);

    List<WorkerResponse> findAll();
}
