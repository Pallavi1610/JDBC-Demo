package com.stackroute.jdbc;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

public class RowSetDemo {

    public void getRowSet() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();
            jdbcRowSet.setUrl("jdbc:mysql://localhost:3306/poojitha");
            jdbcRowSet.setUsername("root");
            jdbcRowSet.setPassword("Root@123");
            jdbcRowSet.setCommand("select * from employee ");
            jdbcRowSet.execute();

            while (jdbcRowSet.next()) {
                System.out.println("id is " + jdbcRowSet.getInt(1));
                System.out.println("name is " + jdbcRowSet.getString(2));
                System.out.println("age is " + jdbcRowSet.getString(3));
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }
}
