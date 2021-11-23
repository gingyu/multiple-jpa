package com.mjpa.repository.db2;

import com.mjpa.domain.db2.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * Email:       kig3534@gmail.com
 * Author:      IG.KIM
 * Created:     2021-11-23
 * git:
 * blog:        kig6022.tistory.com
 * Description:
 */
@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}
