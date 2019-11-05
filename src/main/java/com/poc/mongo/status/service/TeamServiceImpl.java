package com.poc.mongo.status.service;

import com.poc.mongo.status.application.http.request.TeamRequest;
import com.poc.mongo.status.domain.document.Team;
import com.poc.mongo.status.mapping.TeamMapper;
import com.poc.mongo.status.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private TeamMapper teamMapper;

    @Override
    public void getTeam(String name) {
        //just to show that is possible querying data through these two ways
        teamRepository.findById(name);
        mongoTemplate.find(Query.query(Criteria.where("name").is(name)), Team.class);
    }

    @Override
    public void save(TeamRequest teamRequest) {
        teamRepository.save(
                teamMapper.requestToTeam(teamRequest)
        );
    }

    @Override
    public List<Team> findAll() {
        return teamRepository.findAll();
    }
}
