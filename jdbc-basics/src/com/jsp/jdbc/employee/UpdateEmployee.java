package com.jsp.jdbc.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateEmployee {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/javabatch";
		String username = "root";
		String password = "root";
		String sql = "UPDATE employee SET email = 'mihir@gmail.com' WHERE id = 1006";
		Connection connection = null;
		
		
		try {
			// load and register
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create the connection
			connection = DriverManager.getConnection(url, username, password);
			
			//create statement
			Statement statement = connection.createStatement();
			
			// execute statement
			
			int i = statement.executeUpdate(sql);
					
			if (i>0) {
				System.out.println("Data Updated");
			}else {
				System.out.println("Not Updated");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		
	}

	}}