package com.mjpa.dbconfig.querydslconfig;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

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
public abstract class Db2QueryDslRepositorySupport extends QuerydslRepositorySupport {
    public Db2QueryDslRepositorySupport(Class<?> classDoamin) {
        super(classDoamin);
    }

    @Override
    @PersistenceContext(unitName = "db2EntityManager")
    public void setEntityManager(EntityManager entityManager) {
        super.setEntityManager(entityManager);
    }
}
