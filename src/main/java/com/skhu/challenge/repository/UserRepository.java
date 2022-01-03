package com.skhu.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skhu.challenge.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>  {

}
