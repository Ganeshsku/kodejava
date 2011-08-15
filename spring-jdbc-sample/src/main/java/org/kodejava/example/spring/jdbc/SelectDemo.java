package org.kodejava.example.spring.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.HashMap;
import java.util.List;

public class SelectDemo {
    public static void main(String[] args) {
        //
        // Creates a DataSource object.
        //
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost/mediadb");
        ds.setUsername("root");
        ds.setPassword("");

        //
        // Creates an instance of JdbcTemplate.
        //
        JdbcTemplate template = new JdbcTemplate(ds);

        //
        // Executes a select query using queryForList() method. This
        // method returns a List containing HashMap object. The key
        // of the map is the table's field name and the value is
        // the table's field value.
        //
        String query = "SELECT * FROM records";
        List results = template.queryForList(query);
        for (Object result : results) {
            HashMap map = (HashMap) result;
            for (Object key : map.keySet()) {
                System.out.print(key + " = " + map.get(key) + "; ");
            }
            System.out.println();
        }

    }
}
