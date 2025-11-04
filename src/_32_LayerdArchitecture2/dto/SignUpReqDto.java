package _32_LayerdArchitecture2.dto;

import _32_LayerdArchitecture2.Entity.User;
import _32_LayerdArchitecture2.Utill.PasswordEncoder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class SignUpReqDto {
    public User toEntity;
    private String username;
    private String password;
    private String confirmPassword;

    public User toEntity(){
        return User.builder()
                .userID(0)
                .username(username)
                .password(PasswordEncoder.encode(password))
                .build();
    }
}
