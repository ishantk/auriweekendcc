package com.auribises;

import com.auribises.packone.One;
//import com.auribises.packone.Two; -> Because Two is default

public class Exe {

	public static void main(String[] args) {
		
		System.out.println("Main Started...");

		One oRef = new One();
		oRef.pubShow();
		/*oRef.pvtShow();
		oRef.defShow();
		oRef.protShow();*/
		
		System.out.println("Main Finished...");
	}

}
