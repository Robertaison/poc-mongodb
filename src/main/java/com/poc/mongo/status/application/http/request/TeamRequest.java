package com.poc.mongo.status.application.http.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class TeamRequest {

    private String name;

    private MemberRequest member;
}
