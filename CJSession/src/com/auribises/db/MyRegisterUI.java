package com.auribises.db;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyRegisterUI implements ActionListener{
	
	// Containers
	JFrame fr;
	JPanel pnlTitle, pnlName, pnlEmail, pnlAddress, pnlButton, pnlAll;
	
	// Components
	JLabel lblTitle, lblName, lblEmail, lblAddress;
	JTextField txtName, txtEmail, txtAddress;
	JButton btnRegister;
	
	public MyRegisterUI() {
		
		fr = new JFrame("Register Student");
		//fr.setTitle("Register Student");
		
		pnlTitle = new JPanel();
		pnlName = new JPanel();
		pnlEmail = new JPanel();
		pnlAddress = new JPanel();
		pnlButton = new JPanel();
		pnlAll = new JPanel();
		
		lblTitle = new JLabel("Register Yourself");
		lblName = new JLabel("Enter Your Name");
		lblEmail = new JLabel("Enter Your Email");
		lblAddress = new JLabel("Enter Your Address");
		//lblTitle.setText("");
		
		txtName = new JTextField(16);
		txtEmail = new JTextField(16);
		txtAddress = new JTextField(16);
		
		btnRegister = new JButton("Register");
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
