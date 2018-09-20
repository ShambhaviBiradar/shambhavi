package com.minds; 

//Example of PreparedStatement interface that deletes the record

import java.sql.*;  
class Demo_delete{  
public static void main(String args[]){  

	try{  
Class.forName("com.mysql.jdbc.Driver");  

Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/test","root","admin"); 

PreparedStatement stmt=con.prepareStatement("delete from emp2 where id1=?");  
stmt.setInt(1,11);  
  
int i=stmt.executeUpdate();  
System.out.println(i+" records deleted");   
con.close();  
}
	catch(Exception e){ System.out.println(e);}  
}  
}