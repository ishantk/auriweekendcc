package com.auribises.db;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class RegisterUI implements ActionListener{
	
	// Containers
	Frame fr;
	Panel pnlTitle, pnlName, pnlEmail, pnlAddress, pnlButton, pnlAll;
	
	// Components
	Label lblTitle, lblName, lblEmail, lblAddress;
	TextField txtName, txtEmail, txtAddress;
	Button btnRegister;
	
	public RegisterUI() {
		
		fr = new Frame("Register Student");
		//fr.setTitle("Register Student");
		
		pnlTitle = new Panel();
		pnlName = new Panel();
		pnlEmail = new Panel();
		pnlAddress = new Panel();
		pnlButton = new Panel();
		pnlAll = new Panel();
		
		lblTitle = new Label("Register Yourself");
		lblName = new Label("Enter Your Name");
		lblEmail = new Label("Enter Your Email");
		lblAddress = new Label("Enter Your Address");
		//lblTitle.setText("");
		
		txtName = new TextField(16);
		txtEmail = new TextField(16);
		txtAddress = new TextField(16);
		
		btnRegister = new Button("Register");
		btnRegister.addActionListener(this);
		
	}
	
	void showFrame(){
		pnlTitle.add(lblTitle);
		
		pnlName.add(lblName);
		pnlName.add(txtName);
		
		pnlEmail.add(lblEmail);
		pnlEmail.add(txtEmail);
		
		pnlAddress.add(lblAddress);
		pnlAddress.add(txtAddress);
		
		pnlButton.add(btnRegister);
		
		pnlAll.add(pnlTitle);
		pnlAll.add(pnlName);
		pnlAll.add(pnlEmail);
		pnlAll.add(pnlAddress);
		pnlAll.add(pnlButton);
		
		GridLayout layout = new GridLayout(5, 1);
		pnlAll.setLayout(layout);
		
		fr.add(pnlAll);
		
		//fr.setSize(500,500);
		fr.pack();
		fr.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnRegister){
			String name = txtName.getText();
			String email = txtEmail.getText();
			String address = txtAddress.getText();
					
			int roll = 12;
			int age = 10;
			
			// JDBC Code Here
			
			Student s = new Student();
			s.roll = roll;
			s.age = age;
			s.name = name;
			s.email = email;
			s.address = address;
			
			JDBCHelper helper = new JDBCHelper();
			helper.createConnection();
			helper.insertStudent(s);
			helper.closeConnection();
			
		}
	}

}
