package org.kodejava.example.spring.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.Types;
import java.util.Date;

public class UpdateDemo {
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost/mediadb";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";

    public static final String QUERY =
            "UPDATE records SET title = ?, release_date = ? WHERE id = ?";

    private DataSource dataSource;

    public UpdateDemo(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public static void main(String[] args) {
        DataSource ds = getDataSource();
        UpdateDemo demo = new UpdateDemo(ds);

        Long id = 2L;
        String title = "The Beatles 1967 - 1970";
        Date releaseDate = new Date();
        demo.updateRecord(id, title, releaseDate);
    }

    public void updateRecord(Long id, String title, Date releaseDate) {
        //
        // Creates an instance of JdbcTemplate and set the DataSource.
        // We can use the template update() method to update records
        // in the database. Below we use an update() method that accepts
        // three parameters: the sql query, the parameter values and
        // the parameter data types.
        //
        JdbcTemplate template = new JdbcTemplate(this.dataSource);

        Object[] params = {title, releaseDate, id};
        int[] types = {Types.VARCHAR, Types.DATE, Types.BIGINT};

        int rows = template.update(UpdateDemo.QUERY, params, types);
        System.out.println(rows + " row(s) updated.");
    }

    /**
     * Returns a data source object.
     *
     * @return a DataSource.
     */
    public static DataSource getDataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName(UpdateDemo.DRIVER);
        ds.setUrl(UpdateDemo.URL);
        ds.setUsername(UpdateDemo.USERNAME);
        ds.setPassword(UpdateDemo.PASSWORD);
        return ds;
    }
}