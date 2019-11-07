package com.poc.mongo.status.repository;

import com.poc.mongo.status.domain.Worker;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRepository extends MongoRepository<Worker, String> {
    Worker findByName(String name);
}
