package com.auribises;

public class Son extends Father{
	
	// Atributes
	int vehicles;
	int pocketMoney;
	
	public int getVehicles() {
		return vehicles;
	}
	public void setVehicles(int vehicles) {
		this.vehicles = vehicles;
	}
	public int getPocketMoney() {
		return pocketMoney;
	}
	public void setPocketMoney(int pocketMoney) {
		this.pocketMoney = pocketMoney;
	}
	@Override
	public String toString() {
		return "Son [vehicles=" + vehicles + ", pocketMoney=" + pocketMoney + "] "+super.toString();
	}
	
	
}
