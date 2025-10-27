package _17_inheritance.Shipment;

public class TruckShipment extends Shipment{
    public TruckShipment(String from, String to) {
        super(from, to);
    }

    @Override
    public int calcFee(int weight, int distance) {
        return super.calcFee(weight, distance);

        //if (weight<0){
            //weight = 0;
    }
        //if (distance < 0)
        }



