package com.mjpa.controller.db1;

import com.mjpa.domain.db1.Member;
import com.mjpa.domain.db1.Team;
import com.mjpa.domain.db2.Car;
import com.mjpa.repository.db1.MemberQueryDslRepository;
import com.mjpa.repository.db1.MemberRepository;
import com.mjpa.repository.db1.TeamRepository;
import com.mjpa.repository.db2.CarRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Email:       kig3534@gmail.com
 * Author:      IG.KIM
 * Created:     2021-11-23
 * git:
 * blog:        kig6022.tistory.com
 * Description:
 */
@Slf4j
@RestController
@RequiredArgsConstructor
public class MainController {
    private final MemberRepository memberRepository;
    private final CarRepository carRepository;
    private final TeamRepository teamRepository;

    private final MemberQueryDslRepository memberQueryDslRepository;

    @PostMapping("addTeam")
    public void addTeam() {
        Team team = new Team();
        team.setTemId(1L);
        team.setTemName("팀1");

        teamRepository.save(team);
    }

    @PostMapping("addMember")
    public void addMemberTest() {
        Team team = teamRepository.findByTemId(1L);

        Member member = new Member();
        member.setMbrId(1L);
        member.setMbrName("홍길동");
        member.setMbrGender("남성");
        member.setMbrAge("20");
        member.setTeam(team);
        memberRepository.save(member);
    }

    @PostMapping("jpa-test2")
    public void addCarTest() {
        Car car = new Car();
        car.setCarId(1L);
        car.setCarName("아반떼");
        car.setCarPrice("2800");

        carRepository.save(car);
    }

    // db1.MEMBER
    @PostMapping("findMember")
    public Object findMember() {
        return memberRepository.findAll();
    }

    // db2.CAR
    @PostMapping("findCar")
    public Object findCar() {
        return carRepository.findAll();
    }

    // db1.TEAM <-> MEMBER
    @PostMapping("findTeam")
    public Object findTeam() {
        Member member = new Member();
        member.setMbrName("홍길동");
        return memberQueryDslRepository.findTeamInfo(member);
    }
}
