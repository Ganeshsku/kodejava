package org.kodejava.example.spring.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

public class DeleteDemo {
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost/mediadb";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";

    public static final String QUERY = "DELETE FROM records WHERE id = ?";

    private DataSource dataSource;

    public DeleteDemo(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void deleteRecord(Long id) {
        //
        // Creates an instance of JdbcTemplate and supply a data
        // source object.
        //
        JdbcTemplate template = new JdbcTemplate(this.dataSource);

        //
        // Delete a student record from database where the students
        // id matches with the specified parameter.
        //
        Object[] params = {id};
        int rows = template.update(DeleteDemo.QUERY, params);
        System.out.println(rows + " row(s) deleted.");
    }

    /**
     * Returns a DataSource object.
     *
     * @return a DataSource.
     */
    public static DataSource getDataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName(DeleteDemo.DRIVER);
        ds.setUrl(DeleteDemo.URL);
        ds.setUsername(DeleteDemo.USERNAME);
        ds.setPassword(DeleteDemo.PASSWORD);
        return ds;
    }

    public static void main(String[] args) {
        DataSource ds = getDataSource();
        DeleteDemo demo = new DeleteDemo(ds);

        Long id = 1L;
        demo.deleteRecord(id);
    }
}
