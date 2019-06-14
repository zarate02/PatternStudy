package com.study.singleton;

public class ServiceInitialization {
	private static Service service = new Service();
	
	public static Service getInstance() {
		return service;
	}

}
