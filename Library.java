
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
Author: [Your Name]
Course: [Your Course]
Date: [Date]

Class: Library
Description: This class implements a library management system that allows adding books from a file,
removing books by ID, and listing all books in the library collection.
*/

public class Library {
    private List<Book> books;

    // Constructor
    public Library() {
        this.books = new ArrayList<>();
    }

    /*
    Method: addBookFromFile
    Purpose: Reads book details from a text file and adds them to the collection.
    Arguments: filePath - the path of the text file containing book details
    Return value: void
    */
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

    /*
    Method: removeBook
    Purpose: Removes a book from the collection based on its ID.
    Arguments: bookID - the ID of the book to be removed
    Return value: void
    */
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

    /*
    Method: listAllBooks
    Purpose: Lists all books currently in the collection.
    Arguments: None
    Return value: void
    */
    public void listAllBooks() {
        for (Book book : books) {
            System.out.println("ID: " + book.getId() + ", Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
    }
}
