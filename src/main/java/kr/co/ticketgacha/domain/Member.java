package kr.co.ticketgacha.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Member {
    @Id
    private Long memberId;
    @Column
    private String id;
    @Column
    private String pw;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String phone;
    @Column
    private boolean admin;
    @Column
    private boolean baned;
    @Column
    private LocalDateTime createdAt;
    @Column
    private LocalDateTime updatedAt;
}
