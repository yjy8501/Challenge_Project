package com.skhu.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skhu.challenge.entity.Date;

public interface DateRepository extends JpaRepository<Date, Integer>  {

}
