package _16_Class.Car;

public class CarMain {
    public static void main(String[] args) {
        //속성값이 아무것도 없는
        Car benz = new Car(); //기본 생성자(NoArgs)
        benz.carName = "S CLASS";
        //속성값 중 carName만 주입된 객체
        Car santafe = new Car("싼타페");
        System.out.println(santafe.carName);

        //속성값 모두 주입된 객체
        Car sorrento = new Car("쏘렌토", 2025, "black");
        sorrento.showInfo();
        sorrento.startCar();
        sorrento.drive();
    }
}
