package com.auribises.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class App {

	public static void main(String[] args) {
		System.out.println("App Started");
		
		Student s1 = new Student();
		s1.roll = 2;
		s1.name = "Jennie";
		s1.age = 21;
		s1.email = "jennie@example.com";
		s1.address = "Country Homes";
		
		System.out.println(s1.name+" lives in "+s1.address);

		// JDBC
		
		/*try {
			
			//1. Load the Driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//2. Create the Connection
			String url = "jdbc:mysql://localhost/auribises";
			String user = "root";
			String password = "";
			
			Connection con = DriverManager.getConnection(url, user, password);
			
			//3. Write the SQL Query
			//String sql = "insert into Student values("+s1.roll+",'"+s1.name+"',"+s1.age+",'"+s1.email+"','"+s1.address+"')";
			String sql = "insert into Student values(?,?,?,?,?)";
			
			//4. Execute SQL Statement
			//Statement stmt = con.createStatement();
			//int i = stmt.executeUpdate(sql);
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, s1.roll);
			ps.setString(2, s1.name);
			ps.setInt(3, s1.age);
			ps.setString(4, s1.email);
			ps.setString(5, s1.address);
			
			int i = ps.executeUpdate();
			
			if(i>0){
				System.out.println(s1.name +" Saved in DB");
			}else{
				System.out.println(s1.name +" not saved in DB");
			}
			
			//5. Close the Connection
			con.close();
			
		} catch (Exception e) {
			System.out.println("Some Error: "+e);
		}*/
		
		RegisterUI ui = new RegisterUI();
		ui.showFrame();
		
		
		System.out.println("App Finished");
	}

}
