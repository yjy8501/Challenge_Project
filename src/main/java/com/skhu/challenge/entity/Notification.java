package com.skhu.challenge.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // 공지사항 번호
    int no;

    // 공지사항 제목
    String title;

    // 공지사항 본문
    String body;
}
