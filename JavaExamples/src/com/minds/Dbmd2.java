package com.minds;
import java.sql.*;  
class Dbmd2{  //Example of DatabaseMetaData interface that prints total number of tables 
public static void main(String args[]){  
try{  
	Class.forName("com.mysql.jdbc.Driver");  
	  
	Connection con=DriverManager.getConnection(  
	"jdbc:mysql://localhost:3306/test","root","admin"); 
  
DatabaseMetaData dbmd=con.getMetaData();  
String table[]={"TABLE"};  
ResultSet rs=dbmd.getTables(null,null,null,table);  
  
while(rs.next()){  
System.out.println(rs.getString(3));  
}  
  
con.close();  
  
}catch(Exception e){ System.out.println(e);}  
  
}  
}