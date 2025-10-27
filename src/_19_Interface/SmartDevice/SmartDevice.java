package _19_Interface.SmartDevice;

/*
* getName, turnOn,turnOff, isTurnedOn
*
* SmartAirConditioner 클래스를 만들고 SmartDevice를 상속
* 고유 속성
* boolean turnedOn
* int temperature = 24
* getName => " 스마트 에어컨 "  리턴
* turnOn => 해당 가전 이름 의 전원을 켭니다. 설정 온도 : **도
* turnedOn => true;
* turnOff = > 반대로
* isTurnedOn => 오버라이드 해서 현재 상태 리턴
*
* */

public interface SmartDevice {
    String getName();
    void turnOn();
    void turnOff();
    boolean isTurnedOn();
}
