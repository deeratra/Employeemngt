package com.cts.empolyeemngt.utils;

import java.sql.*;
public class DBUtils {
	
	public final static String URL="jdbc:oracle:thin:@localhost:1521:XE";
	public static final String driverName="oracle.jdbc.driver.OracleDriver";
	public static final String username = "199";
	public static final String password= "199";
	
	public static Connection getConnection(){
		Connection connection= null;
		try{
			Class.forName(driverName);
			connection = DriverManager.getConnection(URL,username,password);
			return connection;
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	public static void closeConnection(Connection connection){
		try {
			connection.close();
		} catch (SQLException e) {
			
		e.printStackTrace();
			// TODO: handle exception
		}
	}

}
