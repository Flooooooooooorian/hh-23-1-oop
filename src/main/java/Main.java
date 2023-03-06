public class Main {

    public static void main(String[] args) {
        Book abdulsBook = new Book();

        abdulsBook.cover = "Gebäude";
        abdulsBook.author = "Elisabeth Jung";
        abdulsBook.title = "Java Übungsbuch";

        System.out.println(abdulsBook.cover);
        System.out.println(abdulsBook.author);
        System.out.println(abdulsBook.title);
    }
}
