package Q2;



public class Book {
    // 필드 (속성)
    String title;
    String author;
    int price;

    // 생성자
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
        // 'this' 키워드를 사용해야 합니다.
    }

    // 메서드
    public void printInfo() {
        System.out.println("제목: [" + title + "], 저자: [" + author + "], 가격: [" + price + "]원");
    }

    public static void main(String[] args) {
        Book myBook = new Book("자바의 정석", "남궁성", 30000);
        myBook.printInfo();
        // 예: Book myBook = new Book("자바의 정석", "남궁성", 30000);
    }
}