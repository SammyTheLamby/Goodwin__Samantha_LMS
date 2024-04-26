/**
 * Samantha Goodwin
 * Software Development
 * January 28, 2024
 *
 * Class Name: SQLiteDBManager
 *
 *
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLiteDBManager {

    private static final String JDBC_URL = "jdbc:LMS:sqlite:main:tables:books";

    public static Connection connect() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(JDBC_URL);
            System.out.println("Connected to SQLite database.");
        } catch (SQLException e) {
            System.out.println("Error connecting to SQLite database: " + e.getMessage());
        }
        return connection;
    }

    public static void main(String[] args) {
        Connection connection = connect();
        if (connection != null) {
            System.out.println("Connection successful.");
            try {
                connection.close(); // Close the connection
            } catch (SQLException e) {
                System.out.println("Error closing connection: " + e.getMessage());
            }
        } else {
            System.out.println("Connection failed.");
        }
    }
}
