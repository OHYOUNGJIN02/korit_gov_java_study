package _14_Method;

public class Return {
    public static String getName(){
        String name = "오영진";
        return name;
    }
    public static int getAge(){
        int age = 23;
        return age;
    }
    public static void main(String[] args) {
        //반환값
        //Void는 반환값이 없다라는 의미

        String name = getName();
        System.out.println(name);


    }
}
