package org.kodejava.example.spring.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.List;

public class DataSourceDemo {
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String JDBC_URL = "jdbc:mysql://localhost/mediadb";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";

    public static void main(String[] args) {
        //
        // Creates an instance of DriverManagerDataSource and pass
        // it to the JdbcTemplate.
        //
        DataSource source = getDataSource();
        JdbcTemplate template = new JdbcTemplate(source);

        //
        // After creating a template with a data source inject we
        // can do a database manipulation such as the CRUD operation.
        //
        System.out.println("DataSource = " + template.getDataSource());
        List records = template.queryForList("SELECT * FROM records");
        for (int i = 0; i < records.size(); i++) {
            System.out.println("Records = " + records.get(i));
        }
    }

    /**
     * Returns a DataSource object for connection to the database.
     *
     * @return a DataSource.
     */
    private static DataSource getDataSource() {
        //
        // Creates a new instance of DriverManagerDataSource and sets
        // the required parameters such as the Jdbc Driver class,
        // Jdbc URL, database user name and password.
        //
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(DataSourceDemo.DRIVER);
        dataSource.setUrl(DataSourceDemo.JDBC_URL);
        dataSource.setUsername(DataSourceDemo.USERNAME);
        dataSource.setPassword(DataSourceDemo.PASSWORD);
        return dataSource;
    }
}
