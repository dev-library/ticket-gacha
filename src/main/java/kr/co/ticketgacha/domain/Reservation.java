package kr.co.ticketgacha.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

@Entity
public class Reservation {
    @Id
    private Long reservationId;
    @ManyToOne
    private Performance performance;
    @ManyToOne
    private Member member;
    @ManyToOne
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
