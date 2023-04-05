package kr.co.ticketgacha.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Auditorium {
    @Id
    private Long auditoriumId;
    @Column
    private String name;
    @Column
    private int rowCount;
    @Column
    private int colCount;
    @Column
    private boolean deleted;
    @Column
    private LocalDateTime createdAt;
    @Column
    private LocalDateTime updatedAt;
}
