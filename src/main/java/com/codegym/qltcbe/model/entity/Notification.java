package com.codegym.qltcbe.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    @ManyToOne
    private AppUser user1;

    @ManyToOne
    private AppUser user2;

    public Notification(String content, AppUser user1, AppUser user2) {
        this.content = content;
        this.user1 = user1;
        this.user2 = user2;
    }
}
