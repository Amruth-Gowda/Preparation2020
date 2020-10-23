package com.PJDBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dbConnectivity {

	public static void main(String... args) throws SQLException {

		String url = "jdbc:mysql://localhost/testdb";
		String username = "root";
		String password = "root";

		Connection connection = DriverManager.getConnection(url, username, password);
		Statement statement = connection.createStatement();
		System.out.println("connected to db successfully... "+statement);
		
		String sql = "select * from student";
		String sql1 = "insert into student (name) values('Abc')";
		int updateValue = statement.executeUpdate(sql1);
		ResultSet resultSet = statement.executeQuery(sql);
		
		
		while(resultSet.next()) {
			System.out.println(resultSet.getInt("id") +" "+resultSet.getString("name"));
		}
	}
}
