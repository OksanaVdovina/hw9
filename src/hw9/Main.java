package hw9;

public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Scott", "Fitzgerald");
        Author author2 = new Author("Jerome", "Salinger");

        Book book1 = new Book("The Diamond as Big as the Ritz", 1922, author1);
        Book book2 = new Book("The Catcher in the Rye", 1951, author2);

        System.out.println("book1's name - " + book1.getNameOfTheBook());
        System.out.println("book1's author's name - "+ author1.getFirstName() + " " + author1.getLastName());
        System.out.println("book1's year of publishing - " + book1.getPublishingYear());

        System.out.println("book2's name - " + book2.getNameOfTheBook());
        System.out.println("book2's author's name - "+ author2.getFirstName() + " " + author2.getLastName());
        System.out.println("book2's year of publishing - " + book2.getPublishingYear());

        book1.setPublishingYear(2000);
        System.out.println("book1's new year of publishing - " + book1.getPublishingYear());


    }
}
