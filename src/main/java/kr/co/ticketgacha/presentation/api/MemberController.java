package kr.co.ticketgacha.presentation.api;

import jakarta.validation.Valid;
import kr.co.ticketgacha.application.MemberService;
import kr.co.ticketgacha.presentation.dto.CreateMemberRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "member/")
public class MemberController {

    private final MemberService memberService;

    @PostMapping(value = "sign-up")
    public ResponseEntity<Object> signUp(@RequestBody @Valid CreateMemberRequest createMemberRequest) {
        memberService.signUp(createMemberRequest);
        return ResponseEntity.ok().build();
    }
}
