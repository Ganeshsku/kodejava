package org.kodejava.example.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSetExample {
    public static void main(String[] args) throws Exception {
        Connection connection = null;
        try {
            //
            // Here we load the MySQL database Driver class
            //
            Class.forName("com.mysql.jdbc.Driver");

            //
            // Define properties for connecting to database such as
            // database jdbc url, username and password
            //
            String url = "jdbc:mysql://localhost/sampledb";
            String username = "root";
            String password = "";

            //
            // Get a connection to database.
            //
            connection = DriverManager.getConnection(url, username, password);

            //
            // Create a statment object.
            //
            Statement statement = connection.createStatement();

            //
            // Executes a query command to select isbn and the book title
            // from books table. The execute query returns a ResultSet object
            // which is the result of our query execution.
            //
            String query = "SELECT isbn, title, published_date FROM books";
            ResultSet books = statement.executeQuery(query);

            //
            // To get the value returned by the statement.executeQuery we need
            // to iterate the books object until the last items.
            //
            while (books.next()) {
                //
                // To get the value from the ResultSet object we can call
                // a method that correspond to the data type of the column in
                // database table. In the example below we call
                // books.getString("isbn") to get the book's ISBN information.
                //
                System.out.println(books.getString("isbn") + "; "
                        + books.getString("title") + "; "
                        + books.getDate("published_date"));
            }
        } finally {
            if (connection != null && !connection.isClosed()) {
                //
                // We've done the business with the connection object, so
                // let's close it.
                //
                connection.close();
            }
        }
    }
}