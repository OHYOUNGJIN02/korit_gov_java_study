package _02_DataTypes;

public class DataTypes {
    // Main or psvm 단축어/*
// 카멜 표기법 ex) firstName
//
//
// */파스칼 표기법 (쌍봉낙타 표기법) - 클래스명, 파일명
// ex)FirstName
    static void main(String[] args) {
        //정수
        //int - 4byte
//        long - 8byte

        //문자형
        //char - 2byte

        //실수형
        //float - 4byte
        //double -8byte

        //논리형
        //boolean - 1byte true, false

        System.out.println("안녕하세요"); //문자열=>쌍따옴표로 감싸야함
        System.out.println(123);
        System.out.println("123");
        System.out.println(3.14);

    /*
        * 변수 - 값을 담는 바구니
        * 데이터는 바뀔수도 있고 하나하나 수정하기에는 비효율적
        * 재사용성 향상, 유지보수 향상
        *
        * 자료형 변수명 = 데이터;
        * 자료형은 데이터의 형태

       //정수-int, long

      * */

        int num1 = 10;
        System.out.println(num1);
        //int age = 27;
        // System.out.println(age);

        long num2 = 10000000000L;
        System.out.println(num2);

//실수 - double, float
        double d = 3.14;
        System.out.println(d);

        float f = 3.14F;

//문자, 문자열 - char, String
        char lastName = '오';
        String firstName = "영진";

        //String name = "오영진";

//논리형 -boolean
        boolean isEmpty = true;

//이름 변수와 나이 변수, 주소 변수를 선언
        /*
         * 제 이름은 ***이고, 나이는 **살이며, ***에서 살고 있습니다
         * */

        String name = "오영진";
        int age = 23;
        String address = "수영구";
        System.out.println("제 이름은 + name + 이고, 나이는 + age + 살이며, + address + 에서 살고 있습니다");
    }
}





