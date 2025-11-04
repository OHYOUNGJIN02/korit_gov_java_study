package _25_LayeredArchitecture.dto;

import _25_LayeredArchitecture.entity.User;
import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class SignupReqDto {
    private String username;
    private String password;
    private String name;

    public SignupReqDto() {

    }

    public User toEntity(){
        return User.builder()
                .username(username)
                .password(password)
                .name(name)
                .build();

}


}
