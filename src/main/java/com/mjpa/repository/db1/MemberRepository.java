package com.mjpa.repository.db1;

import com.mjpa.domain.db1.Member;
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
public interface MemberRepository extends JpaRepository<Member, Long> {
}
