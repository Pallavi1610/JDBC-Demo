package com.stackroute.jdbc;

import java.sql.*;

public class ResultSetMetadataDemo {
    public void getResultSetMetaDataDetails() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pallavi", "root", "Root@123");
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery("Select * from employee");


        ) {
            ResultSetMetaData rsmd = resultSet.getMetaData();
            if (rsmd != null) {
                int cols = rsmd.getColumnCount();
                System.out.println("Number of Columns: " + cols);
                System.out.println("Table Name: " +
                        rsmd.getTableName(1));
                System.out.println("Catalog Name: " +
                        rsmd.getCatalogName(1));
                System.out.println
                        ("------------------------------------------");
                for (int i = 1; i <= cols; i++) {

                    System.out.println("Column Name: " +
                            rsmd.getColumnName(i));
                    System.out.println("Column Type Name: " +
                            rsmd.getColumnTypeName(i));
                    System.out.println
                            ("--------------------------------------");
                }

            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}