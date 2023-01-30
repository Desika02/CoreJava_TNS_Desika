package jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Jdbcdemo {
	static final String DB_URL ="jdbc:mysql://localhost:3306/b28";
	static final String USER = "root";
	static final String PASS ="Desika";
	static final String QUERY ="SELECT title,price,qty FROM books";
	
	public static void main(String[] args) {
		
		try
		{
			Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(QUERY);
			
		
		while(rs.next())
			{
			 System.out.println("TITLE: " + rs.getString("title"));
			 System.out.println("PRICE: " + rs.getInt("price"));
			 
			 
			}
			}
		catch(SQLException e)
		{
			e.printStackTrace();
			
			
			
		}
	
	
	 


}

	

}
