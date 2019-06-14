package com.study.prototype;

public class Service implements Cloneable{
	private final int inVal1;
	private final int inVal2;
	
	public Service(int inVal1, int inVal2) {
		this.inVal1 = inVal1;
		this.inVal2 = inVal2;
	}
	
	int proc() {
		return this.inVal1 * this.inVal2;
	}
	
	public Service clone() throws CloneNotSupportedException {
		Service service = (Service) super.clone();
		return service;
	}
	
	
	
}
