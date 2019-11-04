package com.poc.mongo.status.api;

import com.poc.mongo.status.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {

    @Autowired
    private TeamService teamService;

    @GetMapping("/team/{id}")
    void getMember(@PathVariable String id) {
        teamService.getTeam(id);
    }
}
