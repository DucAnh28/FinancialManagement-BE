package com.codegym.qltcbe.repo;

import com.codegym.qltcbe.model.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface INotificationRepo extends JpaRepository<Notification, Long> {
    @Query(value = "select * from notification where user2_id = ?1" , nativeQuery = true)
    List<Notification> findAllNotification(Long id);
}
