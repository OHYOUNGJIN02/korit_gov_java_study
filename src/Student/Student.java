package Student;

public class Student {
    String name;
    int age;
    String email;
    String address;

    public void showinfo(){
        System.out.println("[정보출력]");
        System.out.println("이름은 "+ name + ", 나이는 " + age + ", 이메일은 " +email + ", 주소는 " + address);

    }
}
