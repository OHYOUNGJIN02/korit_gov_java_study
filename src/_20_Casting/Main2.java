package _20_Casting;

public class Main2 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Animals animals1 = new Animals();

        //instanceof
        //객체 instanceof 클래스
        boolean result1 = animals1 instanceof Animals;
        System.out.println(result1);
        boolean result2 = animals1 instanceof Dog;
        System.out.println(result2);
        //true : 확인 하고자 하는 객체가 해당 클래스의 인스턴스 이거나 자식 클래스의 인스턴스인지 확인하는 것.

        boolean result3 = dog1 instanceof Dog;
        System.out.println(result3);
        boolean result4 = dog1 instanceof Animals;
        System.out.println(result4);

        Animals animals2 =  new Dog();
       // ((Dog) animals2).wagTail();
        if (animals2 instanceof Dog dog2) {
        //    Dog dog2 = (Dog) animals2;
            dog2.wagTail();
        }else {
            System.out.println("불가능한 다운캐스팅 입니다.");
        }
    }
}
