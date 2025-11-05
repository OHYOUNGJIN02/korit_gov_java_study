package _33_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeValidateException extends Throwable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("나이를 입력하세요. : ");
            int age = scanner.nextInt();
            validateAge(age);
            System.out.println("정상적인 나이 입니다: " + age);


        } catch (InputMismatchException e){
        System.out.println("숫자가 아닙니다, 정수를 입력하세요.");
        }catch (IllegalArgumentException e){
            System.out.println("예외 발생 :" + e.getMessage());
        }finally {
            System.out.println("검증 종료");
        }




        //나이를 입력 받고 검증 함수를 통해 확인 하고
        //나이를 입력 받을때 nextInt로 받게 될텐데 문자열을 넣게 됐을때의 예외처리도 함께
        // -> 숫자가 아닙니다, 정수를 입력해주세요. 출력
        //검증 함수에서 예외 발생시 "예외 발생 : **에러메세지**"출력
        //마지막은 예외 발생 여부 상관 없이 검증 종료 출력

    }

    public static void validateAge(int age){

        if (age <= 0 || age >= 150){
            throw new IllegalArgumentException("유효하지 않은 나이 입니다. (입력값: " + age + ")");
        }

    }

}
