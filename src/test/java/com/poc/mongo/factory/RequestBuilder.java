package com.poc.mongo.factory;

import com.poc.mongo.status.mapping.request.ContactResquest;
import com.poc.mongo.status.mapping.request.ContactResquest.ContactResquestBuilder;
import com.poc.mongo.status.mapping.request.WorkerInformationRequest;
import com.poc.mongo.status.mapping.request.WorkerInformationRequest.WorkerInformationRequestBuilder;
import com.poc.mongo.status.mapping.request.WorkerRequest;
import com.poc.mongo.status.mapping.request.WorkerRequest.WorkerRequestBuilder;

import java.time.LocalDateTime;

public class RequestBuilder {

    public static WorkerRequestBuilder validWorkder() {
        return WorkerRequest.builder()
                .name("Fulano")
                .job("Desenvolvedor")
                .workerInformation(validWorkerInformation().build());
    }

    public static WorkerInformationRequestBuilder validWorkerInformation() {
        LocalDateTime dateTime = LocalDateTime.now();
        return WorkerInformationRequest.builder()
                .birthDate(dateTime)
                .document("45869724156")
                .contact(validContact().build());
    }

    public static ContactResquestBuilder validContact() {
        return ContactResquest.builder()
                .email("worker@email.com")
                .phoneNumber("185746985475");
    }
}
