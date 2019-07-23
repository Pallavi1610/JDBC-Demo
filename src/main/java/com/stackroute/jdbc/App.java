package com.stackroute.jdbc;

import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*SimpleJdbcDemo simpleJdbcDemo = new SimpleJdbcDemo();
     simpleJdbcDemo.getEmployeeDetails();
        simpleJdbcDemo.getEmployeeDetailsInReverse();
        simpleJdbcDemo.getEmployeeDetailsFromSecondRowInReverse();
       simpleJdbcDemo.getEmployeeDetailsByNameAndGender("pallavi","female");*/


        /*DatabaseMetadataDemo dmd =new DatabaseMetadataDemo();
        dmd.getDataBaseMetaDataDetails();*/
/*
        ResultSetMetadataDemo rsmd=new ResultSetMetadataDemo();
        rsmd.getResultSetMetaDataDetails();*/

JdbcBatchDemo jdbc=new JdbcBatchDemo();
jdbc.getBatchDemo();

    }
}
