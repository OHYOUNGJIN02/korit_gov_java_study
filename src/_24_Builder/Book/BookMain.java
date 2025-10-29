package _24_Builder.Book;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book.Builder()
                .bookId(123)
                .title("삶과 죽음의 순환은 계속된다")
                .author("나서스")
                .isbn("abc1235231234")
                .build();

        System.out.println(book.toString());

    }
}