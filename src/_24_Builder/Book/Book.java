package _24_Builder.Book;

public class Book {
    private int bookId;
    private String title;
    private String author;
    private String isbn;

    private Book(Builder builder){
        this.bookId = builder.bookId;
        this.title = builder.title;
        this.author = builder.author;
        this.isbn = builder.isbn;
    }

    public static class Builder {
        public int bookId;
        public String title;
        public String author;
        public String isbn;

        public Builder bookId(int bookId) {
            this.bookId = bookId;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public Builder isbn(String isbn) {
            if (isbn.length() != 13) {
                System.out.println("ISBN 형식이 아닙니다.");
                this.isbn = null;
            } else {
                this.isbn = isbn;
            }
            return this;
        }

        public Book build() {
            if (title == null || author == null ||
            title.isEmpty() || author.isEmpty())
             System.out.println("title 필드 또는 author 필드가 비어있습니다");
            return new Book(this);
        }
    }

    @Override
    public String toString() {
        return "책 아이디는 : " + bookId + ", 책 이름은 : " + title + ", 책 저자는 : " + author + ", 도서 번호는 : " +isbn;
    }
}

