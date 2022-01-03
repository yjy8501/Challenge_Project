package com.skhu.challenge.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // id
    int id;

    // 이메일
    String email;

    // 비밀번호
    String password;

    // 이름
    String name;

    // 전화번호
    String phone;


}
