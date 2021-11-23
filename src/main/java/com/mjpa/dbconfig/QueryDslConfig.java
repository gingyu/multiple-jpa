package com.mjpa.dbconfig;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Email:       kig3534@gmail.com
 * Author:      IG.KIM
 * Created:     2021-11-23
 * git:
 * blog:        kig6022.tistory.com
 * Description:
 */
@Configuration
public class QueryDslConfig {
    @PersistenceContext(unitName = "db1EntityManager")
    EntityManager db1EntityManager;
    @PersistenceContext(unitName = "db2EntityManager")
    EntityManager db2EntityManager;

    @Bean // primary config
    public JPAQueryFactory db1QueryFactory() {
        return new JPAQueryFactory(db1EntityManager);
    }

    @Bean(name = "db2QueryFactory")
    public JPAQueryFactory db2QueryFactory() {
        return new JPAQueryFactory(db2EntityManager);
    }
}
