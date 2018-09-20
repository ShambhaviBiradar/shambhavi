package com.minds;

import java.io.*;  
import java.sql.*;  
  
public class StoreFile {  
public static void main(String[] args) {  
try{  
	Class.forName("com.mysql.jdbc.Driver");  
	  
	Connection con=DriverManager.getConnection(  
	"jdbc:mysql://localhost:3306/test","root","admin");  
              
PreparedStatement ps=con.prepareStatement(  
"insert into FILETABLE values(?,?)");  
              
File f=new File("C:\\Users\\HP_WORLD\\Desktop\\abc.txt");  
FileReader fr=new FileReader(f);  
              
ps.setInt(1,3);  
ps.setCharacterStream(2,fr,(int)f.length());  
int i=ps.executeUpdate();  
System.out.println(i+" records affected");  
              
con.close();  
              
}catch (Exception e) {e.printStackTrace();}  
}  
}  