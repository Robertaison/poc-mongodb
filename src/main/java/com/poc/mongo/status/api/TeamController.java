package com.poc.mongo.status.api;

import com.poc.mongo.status.application.http.request.TeamRequest;
import com.poc.mongo.status.domain.document.Team;
import com.poc.mongo.status.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeamController {

    @Autowired
    private TeamService teamService;

    @GetMapping
    List<Team> getAll(){
        return teamService.findAll();
    }

    @GetMapping("/team/{id}")
    void getMember(@PathVariable String id) {
        teamService.getTeam(id);
    }

    @PostMapping("/post")
    void postTeam(@RequestBody TeamRequest teamRequest){
        teamService.save(teamRequest);
    }
}
