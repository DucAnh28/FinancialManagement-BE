package com.codegym.qltcbe.service.notification;

import com.codegym.qltcbe.model.entity.Notification;
import com.codegym.qltcbe.repo.INotificationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotificationService implements INotificationService {
    @Autowired
    private INotificationRepo iNotificationRepo;

    @Override
    public List<Notification> findAll() {
        return iNotificationRepo.findAll();
    }

    @Override
    public Notification save(Notification notification) {
        return iNotificationRepo.save(notification);
    }

    @Override
    public void remove(Long id) {
        iNotificationRepo.deleteById(id);
    }


    @Override
    public Optional<Notification> findById(Long id) {
        return iNotificationRepo.findById(id);
    }

    @Override
    public List<Notification> findAllNotification(Long id) {
        return iNotificationRepo.findAllNotification(id);
    }
}
