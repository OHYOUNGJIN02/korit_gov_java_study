package _24_Builder.User;

/*
 * int userId
 * String username
 * String email
 * String password
 * 빌더 패턴에 맞춰서 객체가 생성될 수 있도록
 * 최종적으로 객체가 생성될 때 username 필드와 password 필드가 없다면
 * username 필드또는 password 필드가 비어있습니다 를 출력하면서
 * toString 오버라이드해서 객체의 필드가 모두 출력 되도록 커스텀 */

import lombok.Builder;

@Builder

public class User {
    private int userId;
    private String username;
    private String email;
    private String password;

//    private User(Builder builder){
//        this.userId = builder.userId;
//        this.username = builder.username;
//        this.email = builder.email;
//        this.password = builder.password;
//    }
//
//    public static class Builder{
//        public String email;
//        public String password;
//        public String username;
//        private int userId;
//
//        public Builder userId(int userId){
//            this.userId = userId;
//            return this;
//        }
//        public Builder password(String password){
//            this.password = password;
//            return this;
//        }
//        public Builder email(String email){
//            this.email = email;
//            return this;
//        }
//
//        public Builder username(String username){
//            this.username = username;
//            return this;
//        }
//
//
//
//        public User build(){
//            if (username == null || password == null ||
//                username.isEmpty() || password.isEmpty())
//                System.out.println("username 필드 또는 password 필드가 비어있습니다.");
//
//            return new User(this);
//
//        }
//
//
//
//        }
//
//    @Override
//    public String toString() {
//        return " 유저 아이디는 : " + userId + ", 유저 패스워드는 : " + password + ", 유저 네임은 : " + username + ", 유저 이메일은 : " + email;
//    }


}
