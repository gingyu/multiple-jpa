package com.mjpa.repository.db2;

import com.mjpa.dbconfig.querydslconfig.Db2QueryDslRepositorySupport;
import com.mjpa.domain.db2.Car;
import com.querydsl.jpa.impl.JPAQueryFactory;

/**
 * Email:       kig3534@gmail.com
 * Author:      IG.KIM
 * Created:     2021-11-23
 * git:
 * blog:        kig6022.tistory.com
 * Description:
 */
public class CarQueryDslRepository extends Db2QueryDslRepositorySupport {
    private JPAQueryFactory db2QueryFactory;

    public CarQueryDslRepository(JPAQueryFactory db2QueryFactory) {
        super(Car.class);
        this.db2QueryFactory = db2QueryFactory;
    }

    /*
     ...
     ...
     */


}
