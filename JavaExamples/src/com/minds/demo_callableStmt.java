package com.minds;

import java.sql.*;  
public class demo_callableStmt {  
public static void main(String[] args) throws Exception{  
  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/test","root","admin");  
  
CallableStatement stmt=con.prepareCall("{call insertR(?,?)}");  
stmt.setInt(2,5);  
stmt.setString(1,"ddd");  
stmt.execute();  
  
System.out.println("success");  
}  
}  