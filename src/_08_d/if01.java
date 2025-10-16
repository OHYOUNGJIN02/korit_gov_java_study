package _08_d;

import java.util.Scanner;

public class if01 {
    public static void main(String[] args) {
        //조건문 => if문
        /*
        * if (조건) {
        *   해당 조건이 참일때 실행될 코드
        * }
        *
        * */
        int height = 140;
        //키가 120 이상이면 탑승 가능 출력
        if (height >= 120) {
            System.out.println("탑승 가능");

        //String result = height >= 120 ? " 탑승가능" : "탑승 불가능"; //삼합문


     } else {
        System.out.println("탑승불가");
        //키가 120 이상이면서 어린이인 경우만 탑승 가능
        boolean isKid = true;
        if (height >=120 && isKid);
            {
                System.out.println("탑승 가능");


                //키가 120 이상이거나 어린이인 경우 탑승 가능
                if (height >= 120 || isKid) {
                    System.out.println("탑승 가능");
                } else {
                    System.out.println("탑승 불가능");
                }

                //3의 배수인지 판단
                int num = 12;


                //3의 배수이면 3의 배수입니다 출력
                if (num % 3 == 0) {
                    System.out.println("3의 배수입니다");
                } else {
                    System.out.println("3의 배수가 아닙니다");
                }


                //2. 절대값 출력
                int num2 = -12;
                if (num2 >= 0) {
                    System.out.println("num2");

                } else {
                    System.out.println(-num2);
                }

                    if (num2 >= -12) ;


                    //3. 최대값 출력
                int num3 =12;
                int num4 =8;
                if (num3 > num4 ) {
                    System.out.println(num3);
                } else {
                    System.out.println(num4);


                    String userId = "myid1234";
                    String userPw = "qwer1234";
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("아이디 >>>");
                    String inputId = scanner.nextLine();
                    System.out.println("비밀번호 >>>");
                    String inputPw = scanner.nextLine();
                    if (userId.equals(inputId)){
                        if (userPw.equals(inputPw)){
                            System.out.println("로그인 확인");

                        } else {
                            //비밀번호가 틀릴때
                            System.out.println("비밀번호가 틀렸습니다");

                            //아이디가 틀릴때


                }}}}}}}