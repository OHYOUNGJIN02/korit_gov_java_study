package _23_Static.Person;

public class Person {
    public static int population = 0;
    //객체 수준에서의 상수 (객체 수준에서 변경할 수 없는 상수)
    final String COUNTRY = "korea";
    //클래스 전체에서 하나뿐인 상수
    static final String COUNTRY2 = "US";

    public Person() {
        population++; //객체를 만들때마다 증가
    }

    public static void showPopulation(){
        System.out.println("인구 수 : " + population);
        //showPopulation 메소드는 객체가 필요없이 호출이 가능한 메소드인데,
        //안에서 쓰는 population 필드가 스태틱이 아니라면 객체가 필요하기 때문에 사용할 수 없다.
    }
}
