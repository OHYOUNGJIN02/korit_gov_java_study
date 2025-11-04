package _30_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class OrderJson {

    private String orderId;
    private String customer;
    private String product;
    private String quantity;
    private String price;
    private String address;

    public static void main(String[] args) {

        OrderJson order = new OrderJson(
                "ORD123456",
                "곽두팔",
                "에어팟 프로 2세대",
                "1",
                "349000",
                "reciver: 곽두팔, phone: 01012345678, city: 서울, district: 마포구, zipCode:12345"
        );

        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();


        String json2 = gsonBuilder.toJson(order);
        System.out.println("에어팟 배송" + json2);
    }
}


