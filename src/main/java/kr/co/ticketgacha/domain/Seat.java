package kr.co.ticketgacha.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

@Entity
public class Seat {

    @Id
    private Long seatId;
    @ManyToOne
    private Auditorium auditorium;
    @Column
    private String row;
    @Column
    private String col;
    @Column
    private String status;
    @Column
    private LocalDateTime createdAt;
    @Column
    private LocalDateTime updatedAt;
}
