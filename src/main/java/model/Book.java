package model;

public class Book {
    private String cover;
    private String title;
    private String author;
    private int pageCount;
    private String isbn;
    private String publisher;
    private double price;

    public Book() {
    }

    public Book(String cover, String title, String author, int pageCount, String isbn, String publisher, double price) {
        this.cover = cover;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getCover() {
        return cover;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
