package _27_Generic;

public class Main {
    public static void main(String[] args) {
//        ResponseData responseData = new ResponseData();
//        responseData.setData1("집 가고 싶다");
//        responseData.setMessage("String 집 가고 싶다 ");
//        System.out.println(responseData.toStringStr());
        ResponseData<String> responseData = new ResponseData<>();
        ResponseData<Integer> responseData1 = new ResponseData<>();

        String str = GenericEx.identify("I WANT GO HOME");
        System.out.println(str);
    }
}
