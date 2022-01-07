package com.skhu.challenge.entity;

import lombok.Data;


import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
public class Day_Detail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Day_Detail id
    int id;

    // 날짜
    Date date;

    // 챌린지 실행 여부
    Boolean check;

    // 메모
    String memo;

    // 챌린지 이미지 경로
    String image;


    // challenge 객체
    @ManyToOne
    @JoinColumn(name= "challenge_id")
    Challenge challenge;

    // user 객체
    @ManyToOne
    @JoinColumn(name= "user_id")
    User user;
}
