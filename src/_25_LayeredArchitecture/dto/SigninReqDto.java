package _25_LayeredArchitecture.dto;

import _32_LayerdArchitecture2.Entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString

public class SigninReqDto {
    public User toEntity;
    private String username;
    private String password;
}

