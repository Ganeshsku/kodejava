package org.kodejava.example.commons.dbcp;

import org.apache.commons.dbcp.BasicDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class BasicDataSourceExample {
    public static void main(String[] args) throws Exception {
        //
        // Creates a BasicDataSource and defines its properties
        // including the driver class name, jdbc url, username
        // and password.
        //
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost/sampledb");
        dataSource.setUsername("root");
        dataSource.setPassword("");

        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            //
            // Get a connection from the data source and do some
            // database query with the obtained connection.
            //
            conn = dataSource.getConnection();
            stmt = conn.prepareStatement("SELECT * FROM m_users");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println("Username: " + rs.getString("username"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }
}
