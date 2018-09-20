package com.minds;
//inserting image
import java.sql.*;  
import java.io.*;  
public class MysqlCon8_img {  
public static void main(String[] args) {  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/test","root","admin");  
              
PreparedStatement ps=con.prepareStatement("insert into IMGTABLE values(?,?)");  
ps.setString(1,"Dolphin1");  
  
FileInputStream fin=new FileInputStream("C:\\Users\\HP_WORLD\\Desktop\\Dolphin1.jpg");  
ps.setBinaryStream(2,fin,fin.available());  
int i=ps.executeUpdate();  
System.out.println(i+" records affected");  
          
con.close();  
}catch (Exception e) {e.printStackTrace();}  
}  
}