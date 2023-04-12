package kr.co.ticketgacha.application;

import kr.co.ticketgacha.domain.Member;
import kr.co.ticketgacha.domain.MemberRepository;
import kr.co.ticketgacha.presentation.dto.CreateMemberRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    @Transactional
    public void signUp(CreateMemberRequest createMemberRequest) {
        Member member = Member.builder()
                .id(createMemberRequest.getId())
                .pw(createMemberRequest.getPw())
                .email(createMemberRequest.getEmail())
                .name(createMemberRequest.getName())
                .phone(createMemberRequest.getPhone())
                .baned(false)
                .admin(false)
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .build();

        memberRepository.save(member);
    }
}
