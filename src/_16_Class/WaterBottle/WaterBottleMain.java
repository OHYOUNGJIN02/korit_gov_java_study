package _16_Class.WaterBottle;

public class WaterBottleMain {
    public static void main(String[] args) {
    WaterBottle water = new WaterBottle(1000);
    water.drinkWater(900);
    water.fillWater(200);
        System.out.println(water.getCurrentWater());
    }
}
