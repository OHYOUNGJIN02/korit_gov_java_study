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
 * 고유 메소드로 온도 올리는거 하나 내리는거 하나
 * 근데 전원이 꺼져있으면 현재 전원이 꺼져있습니다 출력
 * */

public class SmartAirConditioner implements SmartDevice {
    boolean turnedOn;
    int temperature = 24;

    @Override
    public String getName() {
        return "스마트 에어컨";
    }

    @Override
    public void turnOn() {
        turnedOn = true;
        System.out.println(getName()+"의 전원이 켜졌습니다. 설정 온도 : "+temperature + "℃");
    }

    @Override
    public void turnOff() {
        turnedOn = false;
        System.out.println(getName()+"의 전원이 꺼졌습니다. ");
    }

    @Override
    public boolean isTurnedOn() {
        return turnedOn;
    }

    public void upTemperature() {
        if (turnedOn) {
            temperature++;
            System.out.println("현재 설정 온도 : "+temperature+ "℃");
        } else {
            System.out.println("전원이 꺼져있습니다.");
        }
    }
    public void downTemperture(){
        if (turnedOn){
            temperature--;
            System.out.println("현재 설정 온도 : " + temperature+ "℃");
        } else {
            System.out.println(" 전원이 꺼져있습니다 ");
        }
    }
}
