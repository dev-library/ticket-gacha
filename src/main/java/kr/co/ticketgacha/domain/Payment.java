package kr.co.ticketgacha.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

@Entity
public class Payment {
    @Id
    private Long paymentId;
    @ManyToOne
    @JoinColumn(name = "RESERVATION_ID")
    private Reservation reservation;
    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member member;
    @Column
    private LocalDateTime paymentDate;
    @Column
    private int amount;
    @Column
    private String paymentType;
    @Column
    private String paymentStatus;
    @Column
    private boolean isPaid;
    @Column
    private LocalDateTime createdAt;
    @Column
    private LocalDateTime updatedAt;
}
