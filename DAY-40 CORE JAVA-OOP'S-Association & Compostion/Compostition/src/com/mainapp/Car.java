package com.mainapp;

public class Car {

	private int carNo;
	private int carModelNo;
	
	public Car(int carNo, int carModelNo) {
		this.carNo = carNo;
		this.carModelNo = carModelNo;
	}
	
	public int getCarNo(){
		return carNo;
	}
	
	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}
	
	public int getCarModelNo() {
		return carModelNo;
	}
	
	public void getCarModelNo(int carModelNo) {
		this.carModelNo = carModelNo;
	}
}
