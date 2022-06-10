package hw9;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Scott", "Fitzgerald");
        Author author2 = new Author("Jerome", "Salinger");

        Book book1 = new Book("The Diamond as Big as the Ritz", 1922, author1);
        Book book2 = new Book("The Catcher in the Rye", 1951, author2);

        System.out.println("book1's name - " + book1.getNameOfTheBook());
        System.out.println("book1's year of publishing - " + book1.getPublishingYear());

        System.out.println("book2's name - " + book2.getNameOfTheBook());
        System.out.println("book2's year of publishing - " + book2.getPublishingYear());

        book1.setPublishingYear(2000);
        System.out.println("book1's new year of publishing - " + book1.getPublishingYear());

        // Добавила геттер для автора
        System.out.println();
        System.out.println("Добавленный геттер для автора:");
        System.out.println("book1's author's name - " + book1.getAuthor().getFirstName()  + " " + book1.getAuthor().getLastName());
        System.out.println("book2's author's name - " + book2.getAuthor().getFirstName()  + " " + book2.getAuthor().getLastName());

    }
}
