package org.kodejava.example.sql;

import java.sql.*;

public class TryWithResourceJdbc {
    public static final String URL = "jdbc:mysql://localhost/sampledb";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            TryWithResourceJdbc demo = new TryWithResourceJdbc();
            demo.selectData();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Select data from m_users table.
     * @throws SQLException when an exception happens.
     */
    private void selectData() throws SQLException {
        try (Connection conn = DriverManager.getConnection(URL, "root", "");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM m_users")) {

            while (rs.next()) {
                String username = rs.getString("username");
                String password = rs.getString("password");

                System.out.println("username: " + username +
                        "; password: " + password);
            }
        }
    }
}
