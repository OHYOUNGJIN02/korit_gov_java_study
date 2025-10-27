package _20_Casting;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.speak();
        dog1.wagTail();

        //업 캐스팅 (자식 -> 부모)
        Animals a = new Dog();
        //a는 Animal 타입이지만 내부적으로는 Dog의 객체를 갖고 있다
        //부모가 가지고 있지 않은 건 참조/호출을 할 수 없다
        a.speak();

        //다운캐스팅 (부모 -> 자식)
        ((Dog)a).wagTail();


        Animals a2 = dog1;
        Dog dog2 = (Dog) a2;

        dog2.wagTail();

        //다양한 자식들을 하나의 클래스 타입으로 처리할 수 있다.
        Dog dog3 = new Dog();
        Dog dog4 = new Dog();
        Dog dog5 = new Dog();

        Dog[] dogs = {
                dog3,
                dog4,
                dog5,
        };

        Animals dog = new Dog();
        Animals cat = new Cat();
        Animals tiger = new Tiger();

        Animals[] Animal = {
                dog,
                cat,
                tiger


        };

        Animals[] animal = new Animals[]{new Animals()};
        for (Animals animals : animal ){
            animals.speak();


        }



    }

}
