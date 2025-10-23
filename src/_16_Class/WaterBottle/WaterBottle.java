package _16_Class.WaterBottle;

/*
* currentwater 물의 양 => 속성
* 메소드 물 채우기 fill => 최대 용량 1000으로 이상으로 채울 수 없음
* 메소드 물 마시기 drink => 현재 용량보다 초과해서 마실 수 없음
* getter로 현재 물의 양 출력하기 */
public class WaterBottle {
    WaterBottle(int currentWater){
        this.currentWater = currentWater;
        System.out.println(" 현재 물의 양은 " + currentWater + "ml 입니다. ");
    }
    public int currentWater;

    public int getCurrentWater() {
        return currentWater;
    }

    public void currentWater(){
        return;
    }

    public void drinkWater (int drink){
        if (drink > 0 && currentWater - drink >= 0){
            System.out.println(" 현재 용량을 초과해서 마실 수 없습니다");
        } else {
            currentWater -= drink;
        }

    }
    public void fillWater(int fill) {

        if (fill <= 1000) {
            System.out.println("최대 용량은 1000ml 입니다 ");
        } else {
            currentWater += fill;
            System.out.println("현재 용량 " + currentWater);

        }
    }
}



