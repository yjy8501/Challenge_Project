package com.skhu.challenge.entity;

import lombok.Data;


import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;
import java.sql.Date;

@Data
@Entity
public class Day_Detail implements Serializable {
   /* @Id
    // 챌린지 id
    int challenge_id;

    @Id
    // 유저 id
    int user_id;*/

    @EmbeddedId
    Day_DetailPK pk;

    // 날짜
    Date date;

    // 챌린지 실행 여부
    Boolean check;

    // 메모
    String memo;

    // 챌린지 이미지 경로
    String image;


}
