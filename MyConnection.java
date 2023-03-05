package com.bridzelabz.employeepayrollJdbcDAY35;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MyConnection {
	    public static Connection connection() {
	        Connection root = null;
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            System.out.println("connected");
	            root = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeePayrollService","root","S@ngeetha157");
	            System.out.println("Ready to Boom ............");

	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        } catch (SQLException e) {
	            throw new RuntimeException(e);
	        }
	        return root;
	    }
}
