
package com.minds; 

//Example of PreparedStatement interface that retrieve the records of a table

import java.sql.*;  
class Demo_Retrive{  
public static void main(String args[]){  

	try{  
Class.forName("com.mysql.jdbc.Driver");  

Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/test","root","admin"); 

PreparedStatement stmt=con.prepareStatement("select * from emp");  
ResultSet rs=stmt.executeQuery();  
while(rs.next()){  
System.out.println(rs.getInt(1)+" "+rs.getString(2));  
} 

con.close();  
}
	catch(Exception e){ System.out.println(e);}  
}  
}