package com.poc.mongo.status.service;

import com.poc.mongo.status.domain.Worker;
import com.poc.mongo.status.mapping.WorkerMapper;
import com.poc.mongo.status.mapping.request.WorkerRequest;
import com.poc.mongo.status.mapping.response.WorkerResponse;
import com.poc.mongo.status.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WorkerServiceImpl implements WorkerService {

    @Autowired
    private WorkerRepository workerRepository;

    @Autowired
    private WorkerMapper workerMapper;

    @Override
    public WorkerResponse getWorker(String name) {
        return workerMapper.convertToResponse(
                workerRepository.findByName(name)
        );
    }

    @Override
    public void save(WorkerRequest workerRequest) {
        workerRepository.save(
                workerMapper.convertToEntity(workerRequest)
        );
    }

    @Override
    public List<WorkerResponse> findAll() {
        List<Worker> workersEntity = workerRepository.findAll();
        List<WorkerResponse> workers = new ArrayList<>();

        for(Worker worker: workersEntity){
            workers.add(
                    workerMapper.convertToResponse(worker)
            );
        }

        return workers;
    }
}
