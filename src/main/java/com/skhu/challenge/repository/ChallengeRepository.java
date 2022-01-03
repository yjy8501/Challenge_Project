package com.skhu.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skhu.challenge.entity.Challenge;

public interface ChallengeRepository extends JpaRepository<Challenge, Integer>  {

}

