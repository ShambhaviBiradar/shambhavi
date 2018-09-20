package com.minds; 

//prepared stmnt interface(Example of PreparedStatement interface that updates the record)

import java.sql.*;  
class UpdateInserted{  
public static void main(String args[]){  

	try{  
Class.forName("com.mysql.jdbc.Driver");  

Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/test","root","admin"); 

PreparedStatement stmt=con.prepareStatement("update emp1 set Name=? where Id=?");  
stmt.setString(1,"aaa"); 
stmt.setInt(2,1);  
  
int i=stmt.executeUpdate();  
System.out.println(i+" records updated");  
con.close();  
}
	catch(Exception e){ System.out.println(e);}  
}  
}