package hw9;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Автор книги: " + author + ", Название книги: " + nameOfTheBook + ", год издания: " + publishingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(nameOfTheBook, book.nameOfTheBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfTheBook, publishingYear, author);
    }
}
