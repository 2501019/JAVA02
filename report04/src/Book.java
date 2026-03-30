public class Book {
    String title;
    String author;

    // 생성자
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // toString()
    @Override
    public String toString() {
        return "책 제목 : " + title + ", 저자 : " + author;
    }
}
