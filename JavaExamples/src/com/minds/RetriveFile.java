package com.minds;
import java.io.*;  
import java.sql.*;  
  
public class RetriveFile {  
public static void main(String[] args) {  
try{  
	Class.forName("com.mysql.jdbc.Driver");  
	  
	Connection con=DriverManager.getConnection(  
	"jdbc:mysql://localhost:3306/test","root","admin");  
              
PreparedStatement ps=con.prepareStatement("select * from FILETABLE");  
ResultSet rs=ps.executeQuery();  
rs.next();//now on 1st row  
              
Clob c=rs.getClob(2);  
Reader r=c.getCharacterStream();              
              
FileWriter fw=new FileWriter("d:\\abc.txt");  
              
int i;  
while((i=r.read())!=-1)  
fw.write((char)i);  
              
fw.close();  
con.close();  
              
System.out.println("success");  
}catch (Exception e) {e.printStackTrace();  }  
}  
}