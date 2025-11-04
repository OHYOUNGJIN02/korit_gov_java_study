package _30_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@ToString

class User{
    private String username;
    private String password;
    private String email;
    private String name;
}

public class Json02 {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();

        String userJson = null;

        //java object => json
        User user1 = new User("youngjin", "123", "123@naver.com","오영진");
        userJson = gson.toJson(user1);
        System.out.println("Gson 사용 결과 : " + userJson);
        userJson = gsonBuilder.toJson(user1);
        System.out.println(userJson);

        //gsonBuilder => gson보다 더 줄 정리가 잘 되어 있음

        //Map => Json
        Map<String, String> map1 = new HashMap<>();
        map1.put("productCode", "NT960XHA-KD72G");
        map1.put("ProductName", "삼성 갤럭시북 프로5");

        System.out.println("gson 사용 결과 : " + gson.toJson(map1));
        System.out.println("gson빌더 사용 결과 : " + gsonBuilder.toJson(map1));
        String productJson = gsonBuilder.toJson(map1);

        //Json => Map
        Map<String, String> map2 = gson.fromJson(productJson, Map.class);
        System.out.println(map2);
        //gson.fromJson(json데이터, 바꾸고자 하는 클래스명.class)

        //Json => User 클래스의 인스턴스로 바꾸는 방법
        User user2 = gson.fromJson(userJson, User.class);
        System.out.println(user2);

        //Json => JsonObject

    }
}
