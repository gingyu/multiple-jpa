package com.mjpa.domain.db1;

import lombok.Data;

import javax.persistence.*;
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
@Table(name="MEMBER")
public class Member {
    @Id
    @Column(name = "MBR_ID")
    private Long mbrId;
    @JoinColumn(name = "TEM_ID")
    @ManyToOne
    private Team team;
    @Column(name = "MBR_NAME")
    private String mbrName;
    @Column(name = "MBR_AGE")
    private String mbrAge;
    @Column(name = "MBR_GENDER")
    private String mbrGender;

}
