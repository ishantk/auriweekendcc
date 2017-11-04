package com.auribises.db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


// DAO | Data Access Objects
public class JDBCHelper {

	Connection con;
	PreparedStatement ps;
	CallableStatement cs;
	Statement stmt;
	
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
	
	public void batchProcessing(){
		try {
			
			String sql1 = "update Student set name = 'George' where roll = 5";
			String sql2 = "delete from Student where roll = 2";
			
			stmt = con.createStatement();
			
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			
			con.setAutoCommit(false);
			
			stmt.executeBatch();
			
			con.commit();
			
		} catch (Exception e) {
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("Some Exception: "+e);
		}
	}
	
	public void executeProcedure(Student s){
		try {
			
			String sql = "{ call registerStudent(?,?,?,?,?) }";
			cs = con.prepareCall(sql);
			
			cs.setInt(1, s.roll);
			cs.setString(2, s.name);
			cs.setInt(3, s.age);
			cs.setString(4, s.email);
			cs.setString(5, s.address);
			
			cs.execute();
			
			System.out.println("Procedure Executed...");
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	public ArrayList<Student> retrieveStudents(){
		
		ArrayList<Student> stuList = new ArrayList<>();
		
		try{
			
			
			
			//3. Write the SQL Query
			
			String sql = "select * from Student";
			
			//4. Execute SQL Statement
			
			ps = con.prepareStatement(sql);
		
			
			ResultSet rs = ps.executeQuery();
			
			int r=0,a=0;
			String n="",ad="",e="";
			while(rs.next()){
				r = rs.getInt(1);
				a = rs.getInt(3);
				n = rs.getString(2);
				e = rs.getString(4);
				ad = rs.getString(5);
				
				//System.out.println(r+" - "+a+" - "+n+" - "+e+" - "+ad);
				//System.out.println("---------------------------------");
				
				Student s = new Student(r,n,a,e,ad);
				stuList.add(s);
			}
			
			
		}catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
		return stuList;
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
	
	public void updateStudent(Student s){
		
		try{
			
			//3. Write the SQL Query
			String sql = "update Student set name = ?, age = ? where roll = ?";
			
			//4. Execute SQL Statement			
			ps = con.prepareStatement(sql);			
			ps.setString(1, s.name);
			ps.setInt(2, s.age);
			ps.setInt(3, s.roll);

			
			int i = ps.executeUpdate();
			
			if(i>0){
				System.out.println(s.name +" Updated in DB");
			}else{
				System.out.println(s.name +" not Updated in DB");
			}
			
		}catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
public void deleteStudent(int roll){
		
		try{
			
			//3. Write the SQL Query
			String sql = "delete from Student where roll = ?";
			
			//4. Execute SQL Statement			
			ps = con.prepareStatement(sql);			
			ps.setInt(1, roll);

			
			int i = ps.executeUpdate();
			
			if(i>0){
				System.out.println(roll +" deleted from DB");
			}else{
				System.out.println(roll +" not deleted from DB");
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
