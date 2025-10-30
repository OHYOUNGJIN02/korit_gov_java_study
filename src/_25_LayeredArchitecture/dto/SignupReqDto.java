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

    public User toEntity(){
        return User.builder()
                .username("아")
                .password("123")
                .name("abc")
                .build();

}


}
