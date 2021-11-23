package com.mjpa.repository.db1;

import com.mjpa.dbconfig.querydslconfig.Db1QueryDslRepositorySupport;
import com.mjpa.domain.db1.Member;
import com.mjpa.domain.dto.TeamInfo;
import com.querydsl.core.types.Projections;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.core.types.dsl.StringPath;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

import static com.mjpa.domain.db1.QMember.member;
import static com.mjpa.domain.db1.QTeam.team;

/**
 * Email:       kig3534@gmail.com
 * Author:      IG.KIM
 * Created:     2021-11-23
 * git:
 * blog:        kig6022.tistory.com
 * Description:
 */
@Repository
public class MemberQueryDslRepository extends Db1QueryDslRepositorySupport {
    private JPAQueryFactory db1QueryFactory;

    public MemberQueryDslRepository(JPAQueryFactory db1QueryFactory) {
        super(Member.class);
        this.db1QueryFactory = db1QueryFactory;
    }

    // team <-> member join
    public TeamInfo findTeamInfo(Member reqMember) {
        return db1QueryFactory.select(Projections.fields(TeamInfo.class,
                    member.mbrName,
                    member.mbrAge,
                    member.mbrGender,
                    member.team
                ))
                .from(member)
                .leftJoin(team)
                .on(member.team.temId.eq(team.temId))
                .where(
                        dynamicEquals(member.mbrName, reqMember.getMbrName())
                ).fetchFirst();
    }

    private BooleanExpression dynamicEquals(StringPath path, String param) {
        return param == null ? null : path.eq(param);
    }
}
