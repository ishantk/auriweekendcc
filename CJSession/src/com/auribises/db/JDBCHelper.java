package com.auribises.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


// DAO | Data Access Objects
public class JDBCHelper {

	Connection con;
	PreparedStatement ps;
	
	public JDBCHelper() {
		try {
			//1. Load the Driver
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	public void createConnection(){
		try {
			
			String url = "jdbc:mysql://localhost/auribises";
			String user = "root";
			String password = "";
			
			con = DriverManager.getConnection(url, user, password);
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	public void insert(Object o){
		
	}
	
	public void insertStudent(Student s){
		
		try{
			
			//3. Write the SQL Query
			//String sql = "insert into Student values("+s1.roll+",'"+s1.name+"',"+s1.age+",'"+s1.email+"','"+s1.address+"')";
			String sql = "insert into Student values(?,?,?,?,?)";
			
			//4. Execute SQL Statement
			//Statement stmt = con.createStatement();
			//int i = stmt.executeUpdate(sql);
			
			ps = con.prepareStatement(sql);
			ps.setInt(1, s.roll);
			ps.setString(2, s.name);
			ps.setInt(3, s.age);
			ps.setString(4, s.email);
			ps.setString(5, s.address);
			
			int i = ps.executeUpdate();
			
			if(i>0){
				System.out.println(s.name +" Saved in DB");
			}else{
				System.out.println(s.name +" not saved in DB");
			}
			
		}catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	public void closeConnection(){
		try {
			con.close();
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
}
