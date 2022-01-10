package com.skhu.challenge.controller;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Optional;

import com.skhu.challenge.entity.Challenge;
import com.skhu.challenge.entity.User;
import com.skhu.challenge.repository.ChallengeRepository;
import com.skhu.challenge.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.skhu.challenge.entity.Day_Detail;
import com.skhu.challenge.repository.Day_DetailRepository;



@RestController
public class DayDetailController {

    @Autowired  Day_DetailRepository day_detailRepository;
    @Autowired  UserRepository userRepository;
    @Autowired  ChallengeRepository challengeRepository;

    // 날짜 별 챌린지 그룹 현황 불러오기
    @GetMapping("root/api/main/{user_id}/{challenge_id}")
    public Day_Detail main(@PathVariable("user_id") Integer user_id, @PathVariable("challenge_id") Integer challenge_id) {

        long miliseconds = System.currentTimeMillis();
        Date date = new Date(miliseconds);

        Optional<Day_Detail> day_detail = Optional.ofNullable(day_detailRepository.findByUserIdAndChallengeIdAndDate(user_id, challenge_id, date));

        if (day_detail.isEmpty()) {
            Optional<User> user = userRepository.findById(user_id);
            Optional<Challenge> challenge = challengeRepository.findById(challenge_id);

            day_detail = Optional.of(new Day_Detail());
            day_detail.get().setChallenge(challenge.get());
            day_detail.get().setUser(user.get());
            day_detail.get().setDate(date);
            day_detail.get().setCheck(false);

            day_detailRepository.save(day_detail.get());

        }
        return day_detail.get();

    }



}