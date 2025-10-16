package _06_String;

public class StringCompare {
    public static void main(String[] args) {
        //문자열 비교
        String str1 = "Java";
        String str2 = "Python";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals("Java"));
        System.out.println(str1.equalsIgnoreCase("java"));

        str1 = "1234";
        str2 = "1234";
        System.out.println(str1 ==str2);
        System.out.println(str1.equals(str2));

        str1 = new String("1234");
        str2 = new String("1234");
        System.out.println(str1 == str2);//참조 위치 비교, 메모리 주소가 다름
        System.out.println(str1.equals(str2)); //내용을 비교
    }
}
