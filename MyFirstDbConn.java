import java.sql.*;
class MyFirstDbConn{	
	public static void main(String args[]){
		try{
		  DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	       	  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/apex","root","root");
		  System.out.println(con);
		}catch(Exception e){
			System.out.println(e);
		}
	}
  }