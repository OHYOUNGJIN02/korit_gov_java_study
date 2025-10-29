package _24_Builder.User;

public class UserMain {
    public static void main(String[] args) {
        User user = User.builder()
                .userId(123)
                .email("123")
                .password("123")
                .username("123")
                .build();
//        User user = new User.Builder()
//                .userId(123)
//                .password("abc123")
//                .username("안녕하쇼")
//                .email("232131@naver.com")
//                .build();
//
//        System.out.println(user.toString());
    }
}
