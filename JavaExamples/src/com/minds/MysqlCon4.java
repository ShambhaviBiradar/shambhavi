package com.minds; //new_table got altered



import java.sql.*;  
class MysqlCon4{  
public static void main(String args[]){  

	try{  
		
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/test","root","admin");  
//here sonoo is database name, root is username and password  
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from new_table");  
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getInt(2)+"  "+rs.getInt(3)+" "+rs.getInt(4)+" "+rs.getInt(5)+ " "+rs.getInt(6));  
con.close();  

}
	catch(Exception e){ System.out.println(e);}  
}  
}