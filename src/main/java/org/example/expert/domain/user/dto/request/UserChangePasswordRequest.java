package org.example.expert.domain.user.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserChangePasswordRequest {

    @NotBlank
    private String oldPassword;

    // @Pattern 어노테이션으로 비밀번호 조건 검증 및 메세지 반환
    @NotBlank
    @Pattern(regexp="^(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d]{8,}$",message = "새 비밀번호는 8자 이상이어야 하고, 숫자와 대문자를 포함해야 합니다.")
    private String newPassword;



}
