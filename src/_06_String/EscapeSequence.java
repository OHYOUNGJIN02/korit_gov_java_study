package _06_String;



public class EscapeSequence {
    public static void main(String[] args) {
        //특수문자, 이스케이프 문자
        // ex) \n, \t, \\, \", \'

        //\n = 개행 (새로운 줄)
        System.out.println("집에\n너무\n가고싶어요");
        // \t (공백 4칸)
        //1.    페이커
        System.out.println("1.\t페이커");
        System.out.println("2.\t손흥민");

        // \\ 역슬래쉬를 문자열에 포함시키고 싶을때 사용
        //"C:\Program Files\java"
        System.out.println("C:\\Program Files\\java");

        // \" 큰 따옴표
        // 손흥민의 팀은 "LA FC"이다//));
        // 작은 따옴표
        System.out.println("페이커는 \'신\'이다 ");

        String id = "990226-1234567";
        System.out.println(id.substring(0,8 ));}






}