package _28_WildCard;

/*
* <? super U> => 하한 경계 와일드 카드
* 하위 클래스 제한 (U와 그 부모 클래스들만 가능)
* 하한이 U
* 쓰기는 가능하나 읽기가 안전하지 않다.
*
* */

public class LowerBounded {
    public static void putDog(Box<? super Animal> box){
        box.setValue(new Dog());
        box.setValue(new Animal());
        Object x = box.getValue();

        // Dog  d = box.getValue(); <= 컴파일 에러, (Box<object>, Box<Animal> 일수도)

        Object o = box.getValue();
        System.out.println(o);
    }
}
