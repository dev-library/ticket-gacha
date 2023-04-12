package kr.co.ticketgacha.presentation.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import kr.co.ticketgacha.presentation.dto.CreateMemberRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class MemberControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    @DisplayName("회원가입 테스트")
    public void test() throws Exception {
        CreateMemberRequest createMemberRequest = CreateMemberRequest.builder()
                .id("id")
                .pw("pw")
                .email("asdasd@naver.com")
                .name("name")
                .phone("01012345678")
                .build();

        mockMvc.perform(
                    post("/member/sign-up")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(objectMapper.writeValueAsString(createMemberRequest))
                )
                .andDo(print())
                .andExpect(status().isOk());
    }

}
