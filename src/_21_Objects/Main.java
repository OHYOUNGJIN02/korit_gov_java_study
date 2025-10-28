package _21_Objects;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("이동윤", "국비");


        Teacher teacher2 = new Teacher("이동윤", "국비");
        System.out.println(teacher1);
        System.out.println(teacher1.equals(teacher2));
        System.out.println(teacher1.hashCode());
        System.out.println(teacher2.hashCode());
    }}

    //equals를 통해 같다라고 판별된 객체는 같은 해시코드를 가져야한다는 자바의 공식 규칙 => 반드시 같이 오버라이드 해줘야 함,
    // 하지만 Hashcode를 오버라이드 할 경우에는 equals 오버라이드는 필수는 아니다.

