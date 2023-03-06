import model.Book;

public class Main {

    public static void main(String[] args) {
        Book abdulsBook = new Book();

        abdulsBook.setCover("Gebäude");
        abdulsBook.setAuthor("Elisabeth Jung");
        abdulsBook.setTitle("Java Übungsbuch");

        System.out.println(abdulsBook.getCover());
        System.out.println(abdulsBook.getAuthor());
        System.out.println(abdulsBook.getTitle());
        System.out.println(abdulsBook.getIsbn());


        Book robinsBook = new Book("Galaxy", "Atlas", "Dr", 0, "456", "Kosmos", 0.0);

        System.out.println(robinsBook.getCover());
        System.out.println(robinsBook.getAuthor());
        System.out.println(robinsBook.getIsbn());
    }
}
