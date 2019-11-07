package com.poc.mongo.status.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("worker")
public class Worker{

    @Id
    private ObjectId objectId;

    private String name;

    private String job;

    private WokerInformation wokerInformation;

    @CreatedDate
    private LocalDateTime dateAdmission;

    @LastModifiedDate
    private LocalDateTime lastUpdade;
}






