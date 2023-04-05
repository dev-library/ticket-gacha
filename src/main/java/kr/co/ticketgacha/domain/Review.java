package kr.co.ticketgacha.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

@Entity
public class Review {
    @Id
    private Long reviewId;
    @ManyToOne
    private Performance performance;
    @ManyToOne
    private Member member;
    @Column
    private String subject;
    @Column
    private String content;
    @Column
    private boolean deleted;
    @Column
    private LocalDateTime createdAt;
    @Column
    private LocalDateTime updatedAt;
}
