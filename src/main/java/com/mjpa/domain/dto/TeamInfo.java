package com.mjpa.domain.dto;

import com.mjpa.domain.db1.Member;
import com.mjpa.domain.db1.Team;
import lombok.Data;

/**
 * Email:       kig3534@gmail.com
 * Author:      IG.KIM
 * Created:     2021-11-23
 * git:
 * blog:        kig6022.tistory.com
 * Description:
 */
@Data
public class TeamInfo {
    private String mbrName;
    private String mbrGender;
    private String mbrAge;
    private Team team;
}
