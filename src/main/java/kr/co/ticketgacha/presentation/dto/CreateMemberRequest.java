package kr.co.ticketgacha.presentation.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;

@Getter
public class CreateMemberRequest {
    @NotNull
    private String id;
    @NotNull
    private String pw;
    @NotNull
    private String name;
    @NotNull
    @Email
    private String email;
    @NotNull
    private String phone;

    @Builder
    public CreateMemberRequest(String id, String pw, String name, String email, String phone) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
}
