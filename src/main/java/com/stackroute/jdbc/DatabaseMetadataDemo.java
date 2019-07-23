package com.stackroute.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseMetadataDemo {
    public void getDataBaseMetaDataDetails(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try(
                Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/pallavi","root","Root@123");
                ) {

            DatabaseMetaData databaseMetaData=conn.getMetaData();
            if(databaseMetaData!=null)
            {
                System.out.println("Database version: "+databaseMetaData.getDatabaseProductVersion());
                System.out.println(("Driver Name:" +databaseMetaData.getDriverName()));
                System.out.println("Driver Version: " +databaseMetaData.getDriverVersion());
                System.out.println("URL: " +databaseMetaData.getURL());
                System.out.println("User Name: "+databaseMetaData.getUserName());

            } else {
                System.out.println("Metadata not supported");
            }
            } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    }


