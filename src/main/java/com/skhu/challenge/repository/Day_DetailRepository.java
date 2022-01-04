package com.skhu.challenge.repository;

import com.skhu.challenge.entity.Day_DetailPK;
import org.springframework.data.jpa.repository.JpaRepository;

import com.skhu.challenge.entity.Day_Detail;

public interface Day_DetailRepository extends JpaRepository<Day_Detail, Day_DetailPK>  {

}
