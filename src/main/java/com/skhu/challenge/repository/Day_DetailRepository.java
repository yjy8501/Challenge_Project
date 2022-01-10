package com.skhu.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skhu.challenge.entity.Day_Detail;

import java.sql.Date;

public interface Day_DetailRepository extends JpaRepository<Day_Detail, Integer>  {

    Day_Detail findByUserIdAndChallengeIdAndDate(Integer user_id, Integer challenge_id, Date date);
}
