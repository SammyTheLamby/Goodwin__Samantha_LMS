import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LibraryManagementSystemGUI extends JFrame {
    private JPanel mainPanel;
    private JTextField txtTitle;
    private JTextField txtAuthor;
    private JTextField txtBarcode;
    private JButton btnAddBook;
    private JButton btnRemoveBook;
    private JButton btnCheckOut;
    private JButton btnCheckIn;
    private JTable tblBooks;

    public LibraryManagementSystemGUI() {
        setTitle("Library Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(mainPanel);
        pack();
        setLocationRelativeTo(null); // Center the window on the screen

        // Action listener for the "Add Book" button
        btnAddBook.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add book functionality goes here
                // Call methods from Library.java to add a book
                // Update the table to display the updated list of books
            }
        });

        // Action listener for the "Remove Book" button
        btnRemoveBook.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Remove book functionality goes here
                // Call methods from Library.java to remove a book
                // Update the table to display the updated list of books
            }
        });

        // Action listener for the "Check Out" button
        btnCheckOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Check out functionality goes here
                // Call methods from Library.java to check out a book
                // Update the table to display the updated list of books
            }
        });

        // Action listener for the "Check In" button
        btnCheckIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Check in functionality goes here
                // Call methods from Library.java to check in a book
                // Update the table to display the updated list of books
            }
        });
    }

    public static void main(String[] args) {
        // Create and display the GUI
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LibraryManagementSystemGUI().setVisible(true);
            }
        });
    }
}
