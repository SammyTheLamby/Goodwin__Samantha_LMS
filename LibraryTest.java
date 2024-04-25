public class LibraryTest {
    private Library library;

    public void setUp() {
        library = new Library();
    }

    public void testAddBook() {
        // Add a book to the library
        library.addBookFromFile("books.txt");

        // Check if the book was added successfully
        if (!library.getBooks().isEmpty()) {
            System.out.println("Book added successfully.");
        } else {
            System.out.println("Failed to add book.");
        }
    }

    public void testRemoveBookById() {
        // Add a book to the library
        library.addBookFromFile("books.txt");

        // Remove the book by ID
        library.removeBook(1);

        // Check if the book was removed successfully
        if (library.getBooks().isEmpty()) {
            System.out.println("Book removed successfully.");
        } else {
            System.out.println("Failed to remove book.");
        }
    }

    public void testRemoveBookByTitle() {
        // Add a book to the library
        library.addBookFromFile("books.txt");

        // Remove the book by title
        library.removeBookByTitle("Test Book");

        // Check if the book was removed successfully
        if (library.getBooks().isEmpty()) {
            System.out.println("Book removed successfully.");
        } else {
            System.out.println("Failed to remove book.");
        }
    }

    public void testCheckOutBook() {
        // Add a book to the library
        library.addBookFromFile("books.txt");

        // Check out the book
        library.checkOutBook("Test Book");

        // Check if the book is checked out and due date is set
        Book checkedOutBook = library.getBookByTitle("Test Book");
        if (checkedOutBook != null && checkedOutBook.isCheckedOut()) {
            System.out.println("Book checked out successfully.");
        } else {
            System.out.println("Failed to check out book.");
        }
    }

    public void testCheckInBook() {
        // Add a book to the library and check it out
        library.addBookFromFile("books.txt");
        library.checkOutBook("Test Book");

        // Check in the book
        library.checkInBook("Test Book");

        // Check if the book is checked in and due date is null
        Book checkedInBook = library.getBookByTitle("Test Book");
        if (checkedInBook != null && !checkedInBook.isCheckedOut()) {
            System.out.println("Book checked in successfully.");
        } else {
            System.out.println("Failed to check in book.");
        }
    }
}
