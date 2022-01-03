package com.skhu.challenge.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Date {
    @Id
    // 챌린지 id
    int challenge_id;

    @Id
    // 유저 id
    int user_id;

    // 날짜
    java.sql.Date day_detail;

    // 챌린지 실행 여부
    Boolean check;

    // 메모
    String memo;

    // 챌린지 이미지 경로
    String image;


}
