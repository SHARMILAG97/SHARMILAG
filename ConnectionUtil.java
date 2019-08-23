package com.revature;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	
	public static Connection getConnection() {
		
		String driverClassName="com.mysql.jdbc.Driver";
	    String 	url =  "jdbc:mysql://localhost:3306/Sample1";
		String username = "root";
		String password  = "root";
		
		Connection con = null;
		try{
			Class.forName(driverClassName);
			con = DriverManager.getConnection(url,username,password);
			System.out.println(con);
		}
		catch(ClassNotFoundException e) {

			e.printStackTrace();

		} catch (SQLException e) {

			e.printStackTrace();
	
		}
		
		return con;
		
	}

}
