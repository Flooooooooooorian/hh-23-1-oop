public class Book {
    private String cover;
    private String title;
    private String author;
    private int pageCount;
    private String isbn;
    private String publisher;
    private double price;

    public String getCover() {
        return cover;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setCover(String newCover) {
        cover = newCover;
    }

    public void setAuthor(String newAuthor) {
        author = newAuthor;
    }

    public void setTitle(String newTitle) {
        title = newTitle;
    }
}
