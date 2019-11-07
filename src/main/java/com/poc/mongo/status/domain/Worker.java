package com.poc.mongo.status.domain.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("worker")
@NoArgsConstructor
@AllArgsConstructor
public class Worker{

    private String name;

    private String job;

    private String dateAdmission;

    private WokerInformation wokerInformation;
}






