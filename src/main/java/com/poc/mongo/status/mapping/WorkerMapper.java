package com.poc.mongo.status.mapping;

import com.poc.mongo.status.domain.Worker;
import com.poc.mongo.status.mapping.request.WorkerRequest;
import com.poc.mongo.status.mapping.response.WorkerResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface WorkerMapper {

    @Mapping(target = "objectId", ignore = true)
    @Mapping(target = "dateAdmission", ignore = true)
    @Mapping(target = "lastUpdade", ignore = true)
    Worker convertToEntity(WorkerRequest workerRequest);

    @Mapping(target="dateAdmission", dateFormat = "dd-MM-yyyy")
    @Mapping(target="lastUpdade", dateFormat = "dd-MM-yyyy")
    @Mapping(target="wokerInformation.birthDate", source = "wokerInformation.birthDate", dateFormat = "dd-MM-yyyy")
    WorkerResponse convertToResponse(Worker worker);
}
