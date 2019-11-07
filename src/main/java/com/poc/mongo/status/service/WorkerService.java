package com.poc.mongo.status.service;

import com.poc.mongo.status.application.http.request.TeamRequest;

import java.util.List;

public interface TeamService {

    void getTeam(String name);

    void save(TeamRequest teamRequest);

    List<Team> findAll();
}
