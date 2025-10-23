package _16_Class.Person;

public class Person {
    private String name;
    private String email;
    private String address;
    public String id;

    public void setId(String id){
        this.id =id;
    }
    public String getID(){
            return id;
    }


    /*
    * 접근 제어자
    * public - 어디서든 접근이 가능
    * protected - 같은 패키지 또는 자식 클래스에서만 접근 가능
    * default - 같은 패키지 에서만 접근이 가능 (명시하지 않으면 default 다)
    * private - 해당 클래스 내부에서만 접근 가능
    * */
}
