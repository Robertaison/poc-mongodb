package com.poc.mongo.status.mapping;

import com.poc.mongo.status.application.http.request.TeamRequest;
import com.poc.mongo.status.domain.document.Team;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TeamMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "member.updatedAt", ignore = true)
    Team requestToTeam(TeamRequest teamRequest);

}
