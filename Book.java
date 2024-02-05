/**
 * Samantha Goodwin
 * Software Development
 * January 28, 2024
 *
 * Class Name: Book
 * 
 * This class represents a Book object in the system.
 * It contains information about the book such as its ID, title, and author.
 */
public class Book {
    private int id;
    private String title;
    private String author;

    /**
     * Constructor
     * 
     * @param id     ID# of the book.
     * @param title  title of the book.
     * @param author author of the book.
     */
    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    // Getter methods

    /**
     * Gets the ID of the book.
     * 
     * @return The ID of the book.
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the title of the book.
     * 
     * @return The title of the book.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the author of the book.
     * 
     * @return The author of the book.
     */
    public String getAuthor() {
        return author;
    }
}
