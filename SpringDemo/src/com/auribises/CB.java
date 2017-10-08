package com.auribises;

import org.springframework.beans.factory.annotation.Autowired;

public class CB {

	CA ca; // HAS-A Relation

	public CA getCa() {
		return ca;
	}

	@Autowired
	public void setCa(CA ca) {
		this.ca = ca;
	}
	
}
