public class Main {
    public static void main(String[] args) {
        // Create a Library instance
        Library library = new Library();

        // Add books from a text file
        library.addBookFromFile("books.txt");

        // List all books in the library
        System.out.println("All books in the library:");
        library.listAllBooks();

        // Remove a book by ID
        int bookIDToRemove = 2;
        System.out.println("\nRemoving book with ID " + bookIDToRemove);
        library.removeBook(bookIDToRemove);

        // List all books after removal
        System.out.println("\nUpdated list of books in the library:");
        library.listAllBooks();
    }
}
