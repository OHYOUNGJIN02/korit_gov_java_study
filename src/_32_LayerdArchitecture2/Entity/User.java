package _32_LayerdArchitecture2.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder

public class User {
    private Integer userID;
    private String username;
    private String password;

}
