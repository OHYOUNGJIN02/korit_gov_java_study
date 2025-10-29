package _24_Builder.NonStaticMember;

public class NonStaticMemberMain {
    public static void main(String[] args) {
        NonStaticMember nonStaticMember =  NonStaticMember.builder()
                .name("오영진")
                .age(24)
                .email("steveholi06@gmail.com")
                .build();

    }
}
