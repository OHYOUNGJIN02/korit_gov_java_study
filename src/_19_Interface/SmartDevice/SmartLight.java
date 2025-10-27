package _19_Interface.SmartDevice;
/*
* 인터페이스 상속 받고 에어컨이랑 똑같이
* 필드 속성으로 turnOn이랑 Brightness = 50
* 고유 메소드로 밝기를 올리는 거 하나 내리는 거 하나
* 올리거나 내릴때 전원이 켜져 있어야 하며 10씩 증감 */

public class SmartLight implements SmartDevice{

    boolean turnedOn;
    int Brightness = 50;

    @Override
    public String getName() {
        return "스마트 라이트";
    }

    @Override
    public void turnOn() {
        turnedOn = true;
        System.out.println(getName()+"의 전원이 켜졌습니다. 설정 밝기 : " + Brightness);

    }

    @Override
    public void turnOff() {
        turnedOn = false;
        System.out.println(getName()+"의 전원이 꺼졌습니다. " );

    }

    @Override
    public boolean isTurnedOn() {
        return turnedOn;
    }

    public void upBrightness() {
        if (turnedOn) {
            Brightness+=10;
            System.out.println("현재 설정 밝기 : "+Brightness);
        } else {
            System.out.println("전원이 꺼져있습니다.");


        }
    }
    public void downBrightness() {
        if (turnedOn) {
            Brightness-=10;
            System.out.println("현재 설정 밝기 : "+ Brightness);
        } else {
            System.out.println("전원이 꺼져있습니다.");

}

    }

}