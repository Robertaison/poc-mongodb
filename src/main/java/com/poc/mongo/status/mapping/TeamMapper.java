package com.poc.mongo.status.mapping;

import com.poc.mongo.status.application.http.request.TeamRequest;
import com.poc.mongo.status.domain.document.Team;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface TeamMapper {

    @Mappings({
        @Mapping(target = "id", ignore = true),
    })
    Team requestToStatus(TeamRequest transitionRequest);
}
