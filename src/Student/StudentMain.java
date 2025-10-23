package Student;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "오영진";
        student1.age = 23;
        student1.email = "trg9956@naver.com";
        student1.address = "광안동";

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.email);
        System.out.println(student1.address);

        student1.showinfo();
    }

}
