package com.poc.mongo.status.resource;

import com.poc.mongo.status.mapping.request.WorkerRequest;
import com.poc.mongo.status.mapping.response.WorkerResponse;
import com.poc.mongo.status.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WorkerController {

    @Autowired
    private WorkerService workerService;

    @GetMapping
    List<WorkerResponse> getAll(){
        return workerService.findAll();
    }

    @GetMapping("/worker/{name}")
    void getMember(@PathVariable String name) {
        workerService.getWorker(name);
    }

    @PostMapping("/post")
    void postTeam(@RequestBody WorkerRequest workerRequest){
        workerService.save(workerRequest);
    }
}
