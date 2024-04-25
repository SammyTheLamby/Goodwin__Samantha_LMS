import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LibraryManagementSystemGUI extends JFrame {
    private Library library;
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
        super("Library Management System");

        // Initialize Library
        library = new Library();

        // Initialize components
        createUIComponents();

        // Add action listeners
        btnAddBook.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String title = txtTitle.getText();
                String author = txtAuthor.getText();
                int barcode = Integer.parseInt(txtBarcode.getText());

                // Add the book to the library
                library.addBook(new Book(barcode, title, author));

                // Display success message
                JOptionPane.showMessageDialog(null, "Book added successfully!");

                // Clear text fields
                txtTitle.setText("");
                txtAuthor.setText("");
                txtBarcode.setText("");
            }
        });

        // Add components to frame
        mainPanel.setLayout(new GridLayout(0, 2));
        mainPanel.add(new JLabel("Title: "));
        mainPanel.add(txtTitle);
        mainPanel.add(new JLabel("Author: "));
        mainPanel.add(txtAuthor);
        mainPanel.add(new JLabel("Barcode: "));
        mainPanel.add(txtBarcode);
        mainPanel.add(btnAddBook);
        mainPanel.add(btnRemoveBook);
        mainPanel.add(btnCheckOut);
        mainPanel.add(btnCheckIn);
        mainPanel.add(new JScrollPane(tblBooks));

        getContentPane().add(mainPanel);
        pack(); // Adjust frame size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center frame on screen
    }

    private void createUIComponents() {
        // Custom Create components
        mainPanel = new JPanel();
        txtTitle = new JTextField(20);
        txtAuthor = new JTextField(20);
        txtBarcode = new JTextField(20);
        btnAddBook = new JButton("Add Book");
        btnRemoveBook = new JButton("Remove Book");
        btnCheckOut = new JButton("Check Out");
        btnCheckIn = new JButton("Check In");
        tblBooks = new JTable();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LibraryManagementSystemGUI().setVisible(true);
            }
        });
    }
}
