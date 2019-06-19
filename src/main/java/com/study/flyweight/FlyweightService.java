package com.study.flyweight;

public class FlyweightService {

	static Service[] serviceList = {null, null, null, null, null};
	
	static Service getInstance(int inVal) {
		
		inVal = inVal%5;
		
		if (serviceList[inVal] == null) {
			Service service = new Service();			
			serviceList[inVal] = service;
			return service;
		}
		else {
			return serviceList[inVal];			
		}
	}
}
