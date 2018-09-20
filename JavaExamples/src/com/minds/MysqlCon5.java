package com.minds; 

//prepared stmnt interface

import java.sql.*;  
class MysqlCon5{  
public static void main(String args[]){  

	try{
		
Class.forName("com.mysql.jdbc.Driver");  

Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/test","root","admin"); 

PreparedStatement stmt=con.prepareStatement("insert into Emp values(?,?,?)");  

stmt.setInt(1,102);//1 specifies the first parameter in the query  

stmt.setString(2,"Ratan");

stmt.setString(3,"Raam");
int i=stmt.executeUpdate();  
System.out.println(i+" records inserted");  
 

con.close();  
}
	catch(Exception e){ System.out.println(e);}  
}  
}