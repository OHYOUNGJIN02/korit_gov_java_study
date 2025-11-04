package _30_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.Map;

@ToString
@AllArgsConstructor

class Book{
private String isbn;
private String title;
private String author;
private String price;
private String publisher;
}

//Book 클래스 만들고 객체 생성 
//isbn, title, autor, price, publisher => string 
//"978-123456780, "자바의 정석", "남궁성", "38000", "도우출판"
//Book 객체 => Json 문자열
//Json => Map
//Map -> pretty Json 
//Json => Book 객체 


//Book 클래스 만들고 객체 생성
//isbn, title, author, price, publisher => string
//"978-1234567890, "자바의 정석", "남궁성", "38000", "도우출판"
//Book 객체 => Json 문자열
//Json => Map
//Map -> pretty Json
//Json => Book 객체

    public class BookJson {
        public static void main(String[] args) {
            Book bookJson = new Book("978-123456780", "자바의 정석", "남궁성", "38000", "도우출판");
            Gson gson = new Gson();
            String jsonbook = gson.toJson(bookJson);
            Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();

            Map<String, String> bookMap = gson.fromJson(jsonbook, Map.class);
            System.out.println(jsonbook);


            String prettyJsonFromMap = gsonBuilder.toJson(bookMap);
            System.out.println(bookMap);

            Book parseBook = gson.fromJson(jsonbook, Book.class);
            System.out.println(parseBook);

            Book parsedBook2 = gson.fromJson(prettyJsonFromMap, Book.class);

        }}
