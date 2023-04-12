package kr.co.ticketgacha.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @Builder
    public Member(String id, String pw, String name, String email, String phone, boolean admin, boolean baned, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.admin = admin;
        this.baned = baned;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
