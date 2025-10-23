package Student;

public class Student {
    private String name;
    private int age;
    private String email;
    private String address;

    Student(String name, int age, String email, String address){
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void showinfo(){
        System.out.println("[정보출력]");
        System.out.println("이름은 "+ name + ", 나이는 " + age + ", 이메일은 " +email + ", 주소는 " + address);

    }
}
