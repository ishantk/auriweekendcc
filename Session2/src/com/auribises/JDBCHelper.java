package com.auribises;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCHelper {

	Connection con;
	PreparedStatement pStmt;
	
	// 1. Load the Driver
	public JDBCHelper(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("--Driver Loaded--");
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	//2. Create Connection
	public void openConnection(){
		try {
			
			String url = "jdbc:mysql://localhost/AuriCC";
			String user = "root";
			String pass = "";
			
			con = DriverManager.getConnection(url,user,pass);
			System.out.println("--Connection Created--");
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	//3. Write SQL Statement
	//4. Execute SQL Statement
	public int registerUser(User user){
		
		int i = 0;
		
		try {
			
			String sql = "insert into User values(null,?,?,?)";
			
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, user.getName());
			pStmt.setString(2, user.getEmail());
			pStmt.setString(3, user.getPassword());
			
			i = pStmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
		return i;
	}
	
	
	public boolean loginUser(User user){
		boolean check = true;
		try{
			String sql = "select * from User where email = ? and password = ?";
			pStmt = con.prepareStatement(sql);
			
			pStmt.setString(1, user.getEmail());
			pStmt.setString(2, user.getPassword());

			ResultSet rs = pStmt.executeQuery();
			
			check = rs.next();
			
		}catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
		
		return check;
	}
	
	//5. Close Connection
	public void closeConnection(){
		try {
			con.close();
			System.out.println("--Connection Closed--");
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
}
