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
    private boolean checkedOut;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.checkedOut = false;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }
}
