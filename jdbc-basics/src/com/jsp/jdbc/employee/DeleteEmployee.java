package com.jsp.jdbc.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/javabatch";
		String username = "root";
		String password = "root";
		String sql = "DELETE FROM employee Where id = 1006";
		Connection connection = null;
		
		try {
			// load and register
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// establish the connection
			connection = DriverManager.getConnection(url, username, password);
			
			// establish the statement
			Statement statement = connection.createStatement();
			
			//execute the statement
			int i = statement.executeUpdate(sql);
			
			if(i>0) {
				System.out.println("Deleted");
			}else {
				System.out.println("Not Deleted");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}	

	}

}