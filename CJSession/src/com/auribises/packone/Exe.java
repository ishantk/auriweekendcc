package com.auribises.packone;

public class Exe {

	public static void main(String[] args) {
		
		One o = new One();
		Two t = new Two();

		o.pubShow();
		o.defShow();
		o.protShow();
		//o.pvtShow();
		
		t.pubShow();
		t.defShow();
		t.protShow();
		//t.pvtShow();
		
	}

}
