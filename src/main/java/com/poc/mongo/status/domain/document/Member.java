package com.poc.mongo.status.domain.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Member {

    private String code;

    private String name;

    private LocalDateTime updatedAt;
}
