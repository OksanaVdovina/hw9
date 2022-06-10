package hw9;

public class Book {
    private final String nameOfTheBook;
    private int publishingYear;
    Author author;

    public Book(String nameOfTheBook, int publishingYear, Author author) {
        this.nameOfTheBook = nameOfTheBook;
        this.publishingYear = publishingYear;
        this.author = author;
    }

    public String getNameOfTheBook() {
            return this.nameOfTheBook;
    }

    public int getPublishingYear() {
            return publishingYear;
    }
    public void setPublishingYear(int publishingYear){
        this.publishingYear = publishingYear;
    }

    // Добавила геттер для автора:
    public Author getAuthor() {
        return author;
    }

}
