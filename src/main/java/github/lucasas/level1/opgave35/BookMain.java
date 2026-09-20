package github.lucasas.level1.opgave35;

import java.util.ArrayList;
import java.util.List;

public class BookMain {
    private List<Book> library = new ArrayList<>();

    void main() {
        Book cleanCode = new Book("Clean Code", "Robert Cecil Martin");
        Book harryPotter = new Book("Harry Potter og Hemmelighedernes Kammer", "J. K. Rowling");
        Book valerian = new Book("Valerian", "Pierre Christin");
        Book sherlock = new Book("The Sign of the Four", "Sir Arthur Conan Doyle");
        Book bible = new Book("Bibelen", "Gud");
        library.add(cleanCode);
        library.add(harryPotter);
        library.add(valerian);
        library.add(sherlock);
        library.add(bible);

        borrowBook("Clean Code");
        borrowBook("Bibelen");
        printAvailableBooks();
        returnBook("Bibelen");
        printAvailableBooks();
    }

    private void borrowBook(String title) {
        library.forEach(book -> {
            if (book.getTitle().equals(title) && book.isAvailable()) {
                System.out.println("Du har nu lånt " + title);
                book.setAvailability(false);
            }
        });
    }

    private void returnBook(String title) {
        library.forEach(book -> {
            if (book.getTitle().equals(title) && !book.isAvailable()) {
                System.out.println("Du har nu afleveret " + title);
                book.setAvailability(true);
            }
        });
    }

    private void printAvailableBooks() {
        System.out.println("=== Tilgængelige bøger ===");
        library.stream()
                .filter(Book::isAvailable)
                .forEach(book -> System.out.println(book.getTitle()));
        System.out.println("==========================");
    }
}
