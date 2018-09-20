package com.minds; 

//prepared stmnt interface

import java.sql.*;  
class MysqlCon7{  
	public static void main(String args[])throws Exception{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","admin");  
		Statement stmt=con.createStatement();  
		  
	  
		int result=stmt.executeUpdate("delete from emp765 where id=33");  
		System.out.println(result+" records affected");  
		con.close();  
}}
