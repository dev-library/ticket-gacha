package kr.co.ticketgacha.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

@Entity
public class Notification {
    @Id
    private Long notificationId;
    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member member;
    @Column
    private String notifyType;
    @Column
    private String content;
    @Column
    private boolean deleted;
    @Column
    private LocalDateTime createdAt;
    @Column
    private LocalDateTime updatedAt;
}
