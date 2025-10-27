package _19_Interface.SmartDevice;

/*
* 똑같이
* 속성으로 TurnedOn, playListName = "발라드"
* 고유 메소드로 playListName을 파라미터로 받아서 해당 재생 목록을 재생하는 메소드
* */

public class SmartSpeaker implements SmartDevice{

    boolean turnedOn;
    String playListName = " 발라드 ";

    @Override
    public String getName() {
        return "스마트 스피커";
    }

    @Override
    public void turnOn() {
        turnedOn = true;
        System.out.println(getName()+"의 전원이 켜졌습니다. ");

    }

    @Override
    public boolean isTurnedOn() {
        return false;
    }

    @Override
    public void turnOff() {
        turnedOn = false;
        System.out.println(getName()+" 의 전원이 꺼졌습니다. ");

    }

    public void setPlayListName(){
        if (turnedOn) {
            turnedOn = true;
            System.out.println(" 현재 재생 목록 : " +playListName);

        }
    }
}
