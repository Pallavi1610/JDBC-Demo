package com.stackroute.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTransactionDemo {
    public void getTransactionDemo()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pallavi", "root", "Root@123");)
        {
            Statement stmt=conn.createStatement();
            stmt.addBatch("insert into employee values(106,'bellam',23,'female')");
            stmt.addBatch("update employee set empname='pallavi eega' where empid=101");
            stmt.executeBatch();


        }

        catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
