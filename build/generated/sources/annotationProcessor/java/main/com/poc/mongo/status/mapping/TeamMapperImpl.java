package com.poc.mongo.status.mapping;

import com.poc.mongo.status.application.http.request.MemberRequest;
import com.poc.mongo.status.application.http.request.TeamRequest;
import com.poc.mongo.status.domain.document.Member;
import com.poc.mongo.status.domain.document.Team;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-11-04T17:32:46-0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 12.0.2 (Oracle Corporation)"
)
@Component
public class TeamMapperImpl implements TeamMapper {

    @Override
    public Team requestToStatus(TeamRequest transitionRequest) {
        if ( transitionRequest == null ) {
            return null;
        }

        Team team = new Team();

        team.setName( transitionRequest.getName() );
        team.setMember( memberRequestToMember( transitionRequest.getMember() ) );

        return team;
    }

    protected Member memberRequestToMember(MemberRequest memberRequest) {
        if ( memberRequest == null ) {
            return null;
        }

        Member member = new Member();

        member.setCode( memberRequest.getCode() );
        member.setName( memberRequest.getName() );

        return member;
    }
}
