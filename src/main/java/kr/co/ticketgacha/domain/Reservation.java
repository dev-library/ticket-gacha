package kr.co.ticketgacha.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

@Entity
public class Reservation {
    @Id
    private Long reservationId;
    @ManyToOne
    @JoinColumn(name = "PERFORMANCE_ID")
    private Performance performance;
    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member member;
    @ManyToOne
    @JoinColumn(name = "SEAT_ID")
    private Seat seat;
    @Column
    private LocalDateTime reservationDate;
    @Column
    private String status;
    @Column
    private LocalDateTime createdAt;
    @Column
    private LocalDateTime updatedAt;
}
