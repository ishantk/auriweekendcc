package com.auribises.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Scanner;

public class FileDemo {

	void fileIntro(){
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/google-services.json");
			if(file.exists()){
				
				if(file.isDirectory()){
					System.out.println(file.getName()+" exists and is a directory");
					
					//file.delete();
					//file.renameTo(file1);
				}else{
					System.out.println(file.getName()+" exists and is a file");
				}
				
				
			}else{
				System.out.println(file.getName()+" does not exists..");
			}
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	void readFromFile(){
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/","google-services.json");
			if(file.exists() && file.isFile()){
				
				//1. FileInputStream
				/*FileInputStream fis = new FileInputStream(file);
				int ch = 0;
				while((ch = fis.read()) != -1){
					System.out.print((char)ch);
				}
				fis.close();*/
				
				//2. FileReader
				FileReader reader = new FileReader(file);
				BufferedReader buffer = new BufferedReader(reader);
				String line = "";
				
				while((line = buffer.readLine()) != null){
					System.out.println(line);
				}
				
				buffer.close();
				reader.close();
			}else{
				System.out.println("Invlaid Request...");
			}
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	void writeInFile(){
		try {
			File file = new File("/Users/ishantkumar/Downloads/auribises.txt");
			/*if(!file.exists())
				file.createNewFile();*/
			
			FileOutputStream fos = new FileOutputStream(file,true);
			//FileWriter writer = new FileWriter(file,true);
			
			String line = "You are Exceptional..!!";
			
			fos.write(line.getBytes());
			//writer.write(line);
			
			fos.close();
			
			System.out.println("File Written");
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	public static void main(String[] args) {
		
		//FileDemo fRef = new FileDemo();
		//fRef.fileIntro();
		//fRef.readFromFile();
		//fRef.writeInFile();
		
		// Read from Console
		try {
			/*InputStreamReader reader = new InputStreamReader(System.in);
			BufferedReader buffer = new BufferedReader(reader);
			System.out.println("Enter Your Name");
			String name = buffer.readLine();
			System.out.println("Hello, "+name+" Today is "+new Date());*/
			
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter your Name");
			String name = scanner.nextLine();
			System.out.println("Hello, "+name+" Today is "+new Date());
		} catch (Exception e) {
			System.out.println("Exception is: "+e);
		}
		
	}

}
