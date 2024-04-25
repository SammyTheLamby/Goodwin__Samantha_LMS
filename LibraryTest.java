import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LibraryTest {
    private Library library;

    @BeforeEach
    public void setUp() {
        library = new Library();
    }

    @Test
    public void testAddBook() {
        // Add a book to the library
        library.addBook(new Book(1, "Test Book", "Test Author"));
        
        // Check if the book was added successfully
        Assertions.assertEquals(1, library.getBooks().size());
    }

    @Test
    public void testRemoveBookById() {
        // Add a book to the library
        Book book = new Book(1, "Test Book", "Test Author");
        library.addBook(book);

        // Remove the book by ID
        library.removeBook(1);

        // Check if the book was removed successfully
        Assertions.assertEquals(0, library.getBooks().size());
    }

    @Test
    public void testRemoveBookByTitle() {
        // Add a book to the library
        Book book = new Book(1, "Test Book", "Test Author");
        library.addBook(book);

        // Remove the book by title
        library.removeBook("Test Book");

        // Check if the book was removed successfully
        Assertions.assertEquals(0, library.getBooks().size());
    }

    @Test
    public void testCheckOutBook() {
        // Add a book to the library
        Book book = new Book(1, "Test Book", "Test Author");
        library.addBook(book);

        // Check out the book
        library.checkOutBook("Test Book");

        // Check if the book is checked out and due date is set
        Assertions.assertTrue(library.getBookByTitle("Test Book").isCheckedOut());
        Assertions.assertNotNull(library.getBookByTitle("Test Book").getDueDate());
    }

    @Test
    public void testCheckInBook() {
        // Add a book to the library and check it out
        Book book = new Book(1, "Test Book", "Test Author");
        library.addBook(book);
        library.checkOutBook("Test Book");

        // Check in the book
        library.checkInBook("Test Book");

        // Check if the book is checked in and due date is null
        Assertions.assertFalse(library.getBookByTitle("Test Book").isCheckedOut());
        Assertions.assertNull(library.getBookByTitle("Test Book").getDueDate());
    }
}
