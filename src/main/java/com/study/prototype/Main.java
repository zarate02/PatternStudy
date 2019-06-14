package com.study.prototype;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Service service = new Service(3,4);
		
		Service service2 = service.clone();
		Service service3 = service.clone();
		Service service4 = service.clone();
		Service service5 = service.clone();
		
		System.out.println(service.proc());
		System.out.println(service2.proc());
		System.out.println(service3.proc());
		System.out.println(service4.proc());
		System.out.println(service5.proc());
	}
}
