package com.skhu.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skhu.challenge.entity.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Integer>  {

}
