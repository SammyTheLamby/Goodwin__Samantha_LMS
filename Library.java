/**
 * Samantha Goodwin
 * Software Development
 * January 28, 2024
 *
 * Class Name: Library
 * 
 * This class provides user with a way to check in and check out books.
 * It contains information about removing or adding.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBookFromFile(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0].trim());
                String title = parts[1].trim();
                String author = parts[2].trim();
                Book book = new Book(id, title, author);
                books.add(book);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void removeBook(int bookID) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getId() == bookID) {
                iterator.remove();
                System.out.println("Book removed successfully.");
                return;
            }
        }
        System.out.println("Book with ID " + bookID + " not found.");
    }

    public void removeBookByTitle(String title) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getTitle().equalsIgnoreCase(title)) {
                iterator.remove();
                System.out.println("Book with title \"" + title + "\" removed successfully.");
                return;
            }
        }
        System.out.println("Book with title \"" + title + "\" not found.");
    }

    public void checkOutBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (!book.isCheckedOut()) {
                    book.setCheckedOut(true);
                    System.out.println("Book with title \"" + title + "\" checked out successfully.");
                    return;
                } else {
                    System.out.println("Book with title \"" + title + "\" is already checked out.");
                    return;
                }
            }
        }
        System.out.println("Book with title \"" + title + "\" not found.");
    }

    public void checkInBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.isCheckedOut()) {
                    book.setCheckedOut(false);
                    System.out.println("Book with title \"" + title + "\" checked in successfully.");
                    return;
                } else {
                    System.out.println("Book with title \"" + title + "\" is not checked out.");
                    return;
                }
            }
        }
        System.out.println("Book with title \"" + title + "\" not found.");
    }

    public void listAllBooks() {
        System.out.println("Printing all books in the library:");
        for (Book book : books) {
            System.out.println("ID: " + book.getId() + ", Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
        System.out.println("End of book list.");
    }
}
