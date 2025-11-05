//package _33_Exception;
//
///*
//* AgeRestrictionException
//* => 나이 제한 대한 예외 클래스
//* */
//
//import java.util.Scanner;
//class AgeRestrictionException(String){
//
//
//
//public class SignUpException extends Exception{
//    }
//    static Scanner scanner = new Scanner(System.in);
//    public static void signup(String username, int age) {
//        if (age < 14) {
//            throw new AgeRestrictionException("만 14세 미만은 가입할 수 없습니다");
//
//        }
//
//
//
//
//
//
//    }
//
//    public static void main(String[] args) {
//        String username = "홍길동";
//        int age =27;
//
//    try{
//        signup(username, age);
//    }catch (AgeRestrictionException e){
//        System.out.println("회원가입 실패 : " +e.getmessage);
//    }













//    /*
//    * signup 메소드(String username, int age)
//    * => 가입 조건이 만 14세 이상
//    * 이 조건에 만족하지 않으면 AgeRestrictionException 발생
//    * 해당 예외는 호출한 곳에서 처리
//    * 만약 예외가 발생하지 않는다면 "username님, 가입을 환영 합니다 출력)
//    *
//    * main에서 예외처리를 해주면 됩니다
//    * 예외 발생시 회원가입 실패 : 이유 ~~ 출력
//    * 예외 유무 상관 없이 회원가입 처리 종료 출력
//    * */
//}
