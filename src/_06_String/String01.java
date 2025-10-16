package _06_String;

public class String01 {
    public static void main(String[] args) {
        String s = "My name is YOUNGJIN OH";
        System.out.println(s.length());//문자열의 길이
        System.out.println(s.toLowerCase()); //소문자로 변환
        System.out.println(s.toUpperCase()); //대문자로 변환

        System.out.println(s.contains("name")); //포함 여부 (true/false)
        System.out.println(s.contains("age"));
        System.out.println(s.indexOf("name")); //위치정보 (인덱스)
        System.out.println(s.indexOf("age")); //해당하는 문자열이 없으면 -1

        s = "I like music and movie and trevel";
        System.out.println(s.lastIndexOf("and"));//lastindexOf = 여러개 중 마지막 위치
        System.out.println(s.lastIndexOf("name")); // 없으면 -1
        System.out.println(s.startsWith("I like")); //해당 문자열로 시작하는가? (true or false로 나옴)
        System.out.println(s.endsWith("trevel"));//해당 문자열로 끝나는가? (true or false로 나옴)

    }
}
