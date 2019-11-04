package com.poc.mongo.status.application.http.request;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class TeamRequest {

    private String name;

    private MemberRequest member;
}
