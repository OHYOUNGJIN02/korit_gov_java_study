package _22_Bean;

public class Main {
    public static void main(String[] args) {
//        UserEntity userEntity = new UserEntity();
//        userEntity.setUserId(1);
//        userEntity.setUserName("이동윤");
//        userEntity.setAge(27);
//        userEntity.setEmail("ewqeqwe@123213");
//        System.out.println(userEntity);

        /*게시글 엔티티
        * 게시글 아이디
        * /게시글 제목
        * 게시글 내용
        * 작성자 아이디
        * 작성자 닉네임
        * 생성시각
        * 수정시각 */

        UserEntityLombok userEntityLombok = new UserEntityLombok();
        userEntityLombok.setUserId(1);
        userEntityLombok.setUserName("오영진");
        userEntityLombok.setAge(24);
        userEntityLombok.setEmail("steveholi06@gmail.com");
        System.out.println(userEntityLombok);
        System.out.println();


        /*
        * Lombok
        * 자바의 반복적인 코드를 자동으로 생성해주는 라이브러리
        * 코드 다이어트를 위함
        * Getter
        * Setter
        * To String
        * 생성자
        * Builder
        *
        * 자바 = 소스코드가 .java로 되어 있음
        * .java 소스코드를 컴파일을 하게 되면 .class 파일로 바뀜
        * 바이트 코드로 이루어져있음 => JVM에 전달 => 실행
        * ====> 빌드
        * 빌드
        * 빌드를 도와주는 빌더가 있는데 종류가 maven, gradle이 있다. < 빌드를 전체적으로 효율적이고 자동화 해주기 위한 외부 빌더 시스템.
        * */
    }
}
