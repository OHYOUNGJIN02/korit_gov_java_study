package _09_SwitchCase;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        //Switch
        //break를 만날때까지 계속 실행

        //ranking => 1 -전액 장학금 출력
        // 2 - 반액 장학금
        // 3 - 소정의 상금
        // 그 이하 - 박수 쳐줌

        int ranking = 2;
        if (ranking == 1) {
            System.out.println("전액 장학금");
        } else if (ranking == 2) {
            //System.out.println("반액 장학금");
        } else if (ranking == 3) {
            //System.out.println("소정의 상금");
        } else {
            System.out.println("박수 쳐줌");

            switch (ranking) {
                //if (ranking == 1){

                //case 1 :
                //System.out.println();
                //break;
                //case 2 : //2와 3의 값이 같은 경우 2에서 멈추지 않고 바로 3으로 가서 출력후 break
                //System.out.println("반액 장학금");
                //break;
                //case 3 :
                //System.out.println("소정의 상금");
                //break;
                //default://모든 case를 만족하지 않을때
                //System.out.println("박수 쳐줌");

            }

            int grade = 1;
            int price = 7000;
            //1등급은 10000, 등급이 낮아질수록 -1000

            switch (grade) {
                //case 1:
                //price += 1000;
                //price += 1000;
                //price += 1000;
                //break;
                // case 2:
                //System.out.println("9000");
                //case 3 :
                //System.out.println("8000");


                //월을 입력받고 int
                //3, 4, 5 spring 출력
                //Scanner scanner =
                //int month = scanner.nextInt();
                case 3:
                case 4:
                case 5:
                    System.out.println("Spring");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Summer");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Autumn");
                    break;
                case 12:
                case 1:
                case 2:
                    System.out.println("Winter");
                    break;

                //숫자 a를 입력받고
                //연산자 기호를 입력받고 (+, -, *,/) +=>유효한 기호가 아닙니다              //// //// int a = scanner.nextInt();
                //int a = scanner.nextInt();
               // String oper = scanner.nextLine();
                //int b = scanner.nextInt();
                //System.out.println("a+>"+a);
                //System.out.println("oper =>"+oper);
                //int b = scanner.nextInt();
            //switch (oper) {
           // case "+":
               // case "-":
                //case "*":
                //case "/":
                default:
                    System.out.println("유효한 기호가 아닙니다");
}}}}