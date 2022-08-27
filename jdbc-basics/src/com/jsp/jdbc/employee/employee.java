package com.jsp.jdbc.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/javabatch";
		String username = "root";
		String password = "root";
		String sql = "INSERT INTO employee VALUES(1006,'atif',27000.00,'atif@gmail.com')";
		Connection connection = null;
		try {
			// load and register
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// establish the connection
			connection = DriverManager.getConnection(url, username, password);
			
			// establish the statement
			Statement  statement = connection.createStatement();
			
			// Execute statement
			statement.execute(sql);
			System.out.println("All Good");
			
			//Close the connection
			connection.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}