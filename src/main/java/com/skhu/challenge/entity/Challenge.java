package com.skhu.challenge.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Challenge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // id
    int id;

    // 챌린지 이름
    String name;

    // 챌린지 개요
    String outline;

    // 아이콘 경로
    String icon;

    // 색깔(16진수)
    String color;

}
