package com.mjpa.domain.db1;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Email:       kig3534@gmail.com
 * Author:      IG.KIM
 * Created:     2021-11-23
 * git:
 * blog:        kig6022.tistory.com
 * Description:
 */
@Data
@Entity
@Table(name = "TEAM")
public class Team {
    @Id
    @Column(name = "TEM_ID")
    private Long temId;
    @Column(name = "TEM_NAME")
    private String temName;
}
