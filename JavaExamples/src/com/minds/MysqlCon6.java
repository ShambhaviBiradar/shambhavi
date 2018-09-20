package com.minds; 

//prepared stmnt interface

import java.sql.*;  
class MysqlCon6{  
public static void main(String args[]){  

	try{  
Class.forName("com.mysql.jdbc.Driver");  

Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/test","root","admin"); 

PreparedStatement stmt=con.prepareStatement("insert into Demo_std values(?,?)");  

stmt.setInt(1,101);
stmt.setString(2,"Ratan");  


int i=stmt.executeUpdate();  
System.out.println(i+" records inserted");  
 

con.close();  
}
	catch(Exception e){ System.out.println(e);}  
}  
}