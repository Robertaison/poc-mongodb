package com.poc.mongo.status.mapping;

import com.poc.mongo.status.domain.Worker;
import com.poc.mongo.status.domain.WorkerInformation;
import com.poc.mongo.status.mapping.request.WorkerRequest;
import com.poc.mongo.status.mapping.response.WorkerInformationResponse;
import com.poc.mongo.status.mapping.response.WorkerResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface WorkerMapper {

    @Mapping(target = "objectId", ignore = true)
    @Mapping(target = "dateAdmission", ignore = true)
    @Mapping(target = "lastUpdate", ignore = true)
    Worker convertToEntity(WorkerRequest workerRequest);

    @Mapping(target="dateAdmission", dateFormat = "dd/MM/yyyy HH:mm")
    @Mapping(target="lastUpdate", dateFormat = "dd/MM/yyyy HH:mm")
    WorkerResponse convertToResponse(Worker worker);

    @Mapping(target = "birthDate", dateFormat = "dd/MM/yyyy")
    WorkerInformationResponse convertInformationToResponse(WorkerInformation workerInformation);
}
